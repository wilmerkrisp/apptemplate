import lombok.NonNull;//@NOTNULL



//import java.util.List;                                  //usual list
//import io.vavr.collection.List;                         //immutable List
//import com.google.common.collect.*;                     //ImmutableList

//@Header@
//--------------------------------------------------------------------------------
//
//                          graph
//                           wilmer 2019/05/30
//
//--------------------------------------------------------------------------------

/**<pre>
 * General info for developer
 *
 * - this is the console application
 *
 * - project optimized for Intellij IDEA, various features used (comment folding, predefined snippets and templates)
 * for installing the same environment set File--Settings repository = git@github.com:wilmerkrisp/idesettingrepository.git  (see https://github.com/wilmerkrisp/idesettingrepository)
 * for creating app the template used https://github.com/wilmerkrisp/apptemplate

 * - the most advanced features of java 12 are used
 * including JPMS (Java Platform Module System)
 *
 * - gradle used (see /build.gradle), please use gradle wrapper ./gradlew for running tasks
 * IDE--Settings--Build--Gradle:
 * select: Gradle wrapper customization in build script
 * delegate IDE build/run actions to gradle
 *
 * - project name inside settings.gradle (rootProject.name)
 *
 * - main class name setted inside gradle.properties
 *
 *  project source sets:
 *
 * - well-known libraries are widely used (Guava, Apache commons)
 *
 * - Lombok annotations are widely used, see configuration inside build.gradle (then /lombok.config autogenerated)
 *
 * - logback used for logging,
 * configuration file at /src/main/resources/logback.xml
 * see log file at /app.log
 * for superfast async logging: uncoment ASYNC_CONSOLE appender(insode logback.xml) and uncomment runtimeOnly "io.projectreactor.addons:reactor-logback" (inside build.gradle)
 *
 * - partially used functional approach (Vavr, Cyclops)
 * wrapping checked exceptions into bool, Try, Either, flow events, Optional depending on situations
 * pattern matching inside Switch
 *
 * - reactive approach is used (spring reactor) for further parallel scaling of threads
 *
 * </pre>*/


//<editor-fold desc="for new project">
/*
 * todo - enable annotation processing for project
 *
 * todo - change package name life.expert.algo.research.base
 *
 * todo - change gradle--use gradle wrapper task configuration
 * - use autoimport
 * - create dir for empty content root auto
 * - using qualified names
 * - delegate IDE build/run actions to gradle
 *
 * todo - add gradle support
 *  you MUST click* on right corner  "enable auto import"
 */
//</editor-fold>



module life.expert.algo {

exports life.expert.algo.research.base;


requires java.logging;

//	requires himalaya;


requires io.vavr;
requires static lombok;
requires static io.vavr.match;
requires com.google.common;
requires org.apache.commons.lang3;
requires org.apache.commons.io;

requires cyclops;
////requires cyclops.reactive.collections;

requires gson;

//requires org.jetbrains.annotations;
//requires error.prone.annotations;
requires reactor.core;

requires org.slf4j;

requires life.expert;
//requires manifold.all;

//requires org.junit.jupiter.api;
//requires org.junit.jupiter.engine;
//requires org.junit.platform.commons;
//requires org.junit.platform.engine;
//requires junit;
//requires org.junit.platform.engine;

}