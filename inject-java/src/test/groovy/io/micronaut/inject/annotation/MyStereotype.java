/*
 * Copyright 2017-2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.inject.annotation;

import io.micronaut.aop.Introduction;
import io.micronaut.aop.introduction.StubIntroducer;
import io.micronaut.context.annotation.AliasFor;
import io.micronaut.context.annotation.ConfigurationReader;
import io.micronaut.context.annotation.Type;
import io.micronaut.retry.annotation.Recoverable;

import javax.inject.Scope;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author graemerocher
 * @since 1.0
 */
@Recoverable
@Introduction
@Scope
@Documented
@Retention(RUNTIME)
@Target({ElementType.TYPE})
@Type(StubIntroducer.class)
@ConfigurationReader
public @interface MyStereotype {
    /**
     * @return The prefix to use to resolve the properties
     */
    @AliasFor(annotation = ConfigurationReader.class, member = "value")
    String value() default "";

}
