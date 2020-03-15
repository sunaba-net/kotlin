/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.debugger.coroutine.data

import com.sun.jdi.ObjectReference
import com.sun.jdi.ThreadReference

/**
 * Represents state of a coroutine.
 * @see `kotlinx.coroutines.debug.CoroutineInfo`
 */
data class CoroutineInfoData(
    val name: String,
    val state: State,
    val stackTrace: List<StackTraceElement>,
    val activeThread: ThreadReference? = null, // for suspended coroutines should be null
    val lastObservedFrameFieldRef: ObjectReference?
) {
    var stackFrameList = mutableListOf<CoroutineStackFrameItem>()

    // @TODO for refactoring/removal along with DumpPanel
    val stringStackTrace: String by lazy {
        buildString {
            appendln("\"$name\", state: $state")
            stackTrace.forEach {
                appendln("\t$it")
            }
        }
    }

    fun isSuspended() = state == State.SUSPENDED

    fun isCreated() = state == State.CREATED

    fun isEmptyStackTrace() = stackTrace.isEmpty()

    enum class State {
        RUNNING,
        SUSPENDED,
        CREATED
    }
}