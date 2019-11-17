/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.checkers;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/foreignAnnotationsJava8/tests")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ForeignJava8AnnotationsTestGenerated extends AbstractForeignJava8AnnotationsTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInTests() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotationsJava8/tests"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("checkerFramework.kt")
    public void testCheckerFramework() throws Exception {
        runTest("compiler/testData/foreignAnnotationsJava8/tests/checkerFramework.kt");
    }

    @TestMetadata("eclipse.kt")
    public void testEclipse() throws Exception {
        runTest("compiler/testData/foreignAnnotationsJava8/tests/eclipse.kt");
    }

    @TestMetadata("typeUseOnObject.kt")
    public void testTypeUseOnObject() throws Exception {
        runTest("compiler/testData/foreignAnnotationsJava8/tests/typeUseOnObject.kt");
    }

    @TestMetadata("compiler/testData/foreignAnnotationsJava8/tests/jsr305")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Jsr305 extends AbstractForeignJava8AnnotationsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInJsr305() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotationsJava8/tests/jsr305"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("defaultAnnotationAppliedToType.kt")
        public void testDefaultAnnotationAppliedToType() throws Exception {
            runTest("compiler/testData/foreignAnnotationsJava8/tests/jsr305/defaultAnnotationAppliedToType.kt");
        }

        @TestMetadata("defaultAnnotationAppliedToTypeForCompiledJava.kt")
        public void testDefaultAnnotationAppliedToTypeForCompiledJava() throws Exception {
            runTest("compiler/testData/foreignAnnotationsJava8/tests/jsr305/defaultAnnotationAppliedToTypeForCompiledJava.kt");
        }

        @TestMetadata("springNullableWithTypeUse.kt")
        public void testSpringNullableWithTypeUse() throws Exception {
            runTest("compiler/testData/foreignAnnotationsJava8/tests/jsr305/springNullableWithTypeUse.kt");
        }

        @TestMetadata("typeArguments.kt")
        public void testTypeArguments() throws Exception {
            runTest("compiler/testData/foreignAnnotationsJava8/tests/jsr305/typeArguments.kt");
        }

        @TestMetadata("typeUseVsMethodConflict.kt")
        public void testTypeUseVsMethodConflict() throws Exception {
            runTest("compiler/testData/foreignAnnotationsJava8/tests/jsr305/typeUseVsMethodConflict.kt");
        }
    }

    @TestMetadata("compiler/testData/foreignAnnotationsJava8/tests/typeEnhancement")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class TypeEnhancement extends AbstractForeignJava8AnnotationsTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInTypeEnhancement() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/foreignAnnotationsJava8/tests/typeEnhancement"), Pattern.compile("^(.+)\\.kt$"), true);
        }

        @TestMetadata("annotatedTypeArguments.kt")
        public void testAnnotatedTypeArguments() throws Exception {
            runTest("compiler/testData/foreignAnnotationsJava8/tests/typeEnhancement/annotatedTypeArguments.kt");
        }

        @TestMetadata("methodWithTypeParameter.kt")
        public void testMethodWithTypeParameter() throws Exception {
            runTest("compiler/testData/foreignAnnotationsJava8/tests/typeEnhancement/methodWithTypeParameter.kt");
        }

        @TestMetadata("notNullVarargsOverrides.kt")
        public void testNotNullVarargsOverrides() throws Exception {
            runTest("compiler/testData/foreignAnnotationsJava8/tests/typeEnhancement/notNullVarargsOverrides.kt");
        }

        @TestMetadata("nullableVarargsOverrides.kt")
        public void testNullableVarargsOverrides() throws Exception {
            runTest("compiler/testData/foreignAnnotationsJava8/tests/typeEnhancement/nullableVarargsOverrides.kt");
        }

        @TestMetadata("returnTypeDifferentConstructor.kt")
        public void testReturnTypeDifferentConstructor() throws Exception {
            runTest("compiler/testData/foreignAnnotationsJava8/tests/typeEnhancement/returnTypeDifferentConstructor.kt");
        }

        @TestMetadata("returnTypeOverrideInKotlin.kt")
        public void testReturnTypeOverrideInKotlin() throws Exception {
            runTest("compiler/testData/foreignAnnotationsJava8/tests/typeEnhancement/returnTypeOverrideInKotlin.kt");
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            runTest("compiler/testData/foreignAnnotationsJava8/tests/typeEnhancement/simple.kt");
        }
    }
}
