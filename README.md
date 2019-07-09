# Java Programming Language
Java is a fully object-oriented programming language and computing platform first released by Sun Microsystems in 1995. Java code is compiled into bytecode which is highly optimized by the Java compiler, so that the Java virtual machine (JVM) can execute Java applications at full speed.

### Why Java
There are lots of application and websites that will not work unless you have Java installed, and more are created every day. Java is fast, secure, and reliable. From laptops to datacenters, game consoles to scientific supercomputers, cell phones to the Internet and Java is free to download.

### Java Version History
In addition to language changes, much more dramatic changes have been made to the Java Class Library over the years, which has grown from a few hundred classes in JDK 1.0 to over three thousand in J2SE 5.

#### J2SE 1.4
Released on February 6th, 2002 was the first release of the Java platform developed under the Java Community Process as JSR 59. Major changes included:
  
<ul>
  Language changes
  <li>assert keyword (specified in JSR 41)</li>
</ul>

<ul>
  Library improvements
    <li>Regular expressions modeled after Perl regular expressions</li>
    <li>Exception chaining allows an exception to encapsulate original lower-level exception</li>
    <li>Internet Protocol version 6 (IPv6) support</li>
    <li>Non-blocking I/O (Java) (named NIO)</li>
    <li>Logging API</li>
    <li>Image I/O API for reading and writing images in formats like JPG and PNG</li>
    <li>Integreted XML parser and XSLT processor (JAXP)</li>
    <li>Integrated security and cryptography extensions (JCE, JSSE, JAAS)</li>
    <li>Java Web Start included</li>
    <li>Preferences API (java.util.prefs)</li>
</ul>

#### J2SE 5.0
Released on September 30, 2004 was originally numbered 1.5, which is still used as the internal version number. The numver was changed to "better reflect the level of maturity, stability, scalability and security of the J2SE". This version was developed under JSR 176.

<ul>
  New Language features:
  <li>Generics: provides complile time (static) type safety for collections and eliminates the need for most typecasts (type conversion)</li>
  <li>Metadata: also called annotations; allow language constructs such as classes and methods to be tagged with additional data, which can then processed by metadata-aware utilities</li>
  <li>Autoboxing/unboxing: automatic conversions between primitive types (such as int) and primitive wrapper classed (such as Integer)</li>
  <li>Enumerations: the enum keyword creates a typesafe, ordered list of values (such as Day.MONDAY, Day,TUESDAY, etc.); previously this could only be achieved by non-typesafe constant integers or manually constructed classes</li>
  <li>Varags: the last parameter of a method can now be declared using a type name followed by three dots</li>
  <li>Enhanced for each loop: the for loop syntax is extended with special syntax for iterating over each member of either an array or any Iterable, such as the standard collection classes</li>
  <li>Improved semantics of execution for multi-threaded Java programs; the new Java memory model addresses issues of complexity, effectiveness, and performance of previous specifications</li>
  <li>Static imports</li>
</ul>
<ul>
  There were also the following improvements to the standard libraries:
  <li>Automatic stuv generation for RMI objects</li>
  <li>Swing: New skinnable look and feel, called synth</li>
  <li>The concurrency utilities in package java.util.concurrent</li>
  <li>Scanner class for parsing data from various input streams and buffers</li>
</ul>

#### Java SE 6
As of the version released on December 11, 2006, Sun replaced the name "J2SE" with Java SE and dropped the ".0" from the version number. Internal numbering for developers remains 1.6.0. This version was developed under JSR 270.

<ul>
  Major changes included in this version:
  <li>Support for older Win9x versions dropped</li>
  <li>Scripting Language Support: Generic API for tight integration with scripting languages, and built-in Mozilla JavaScript Rhino integration.</li>
  <li>Dramatic performance improvements for the core platform, and Swing.</li>
  <li>Improved Web Service support through JAX-WS</li>
  <li>JDBC 4.0 support</li>
  <li>Java Compiler API(JSR 199): an API allowing a Java program to select and invoke a Java Compiler programmatically.</li>
  <li>Upgrade of JAXB to version 2.0: Including integration of a StAX parser.</li>
  <li>Support for pluggable annotations</li>
  <li>GUI improvements, such as integration of SwingWorker in the API, table sorting and filtering, and true Swing double-buffering</li>
  <li>JVM improvements include: synchronization and compiler performance optimizations, new algorithms and upgrades to existing garbage collection algorithms, and application start-up performance</li>
</ul>

#### Java SE 7
This version is a major update that was launched on July 7. 2011 and was made available for developers on July 28, 2011.

<ul>
  Additions in Java 7 include:
  <li>JVM support for dynamic languages, with the new invokedynamic bytecode under JSR-292, following the prototyping work currently done on the Multi Language Virtuak Machine</li>
  <li>Compressed 64-bit pointers (-XX:+UseCompreesedOops)</li>
  <li>Small language changes</li>
  <ul>
    <li>String in switch</li>
    <li>Automatic resource management in try-statement</li>
    <li>Improved type inference for generic instance creation, aka the diamond operator <></li>
    <li>Simplified varangs method declaration</li>
    <li>Binary integer literals</li>
    <li>Allowing underscores in numeric literals</li>
    <li>Catching multiple exception types and rethrowing exceptions with improved type checking</li>
  </ul>
  <li>Concurrency utilitites under JSR 166</li>
  <li>New file I/O library adding support for multiple file systems, file metada and symbolic links. The new packages are java.nio.file, java.nio.file.attribute and java.nio.file.spi</li>
  <li>Timsort is used to sort collections and arrays of objects instead of merge sort</li>
  <li>Library-level support for elliptiv curve cyptography algorithms</li>
  <li>An XRender pipeline for Java 2D, which improves handling of features specific to modern GPUs</li>
  <li>New platform APIs for the graphics features originially implemented in version 6u10 as unsupported APIs</li>
  <li>Enhanced library-level support for new network protocols, including SCTP and Sockets Direct Protocol</li>
  <li>Upstream updates to XML and Unicode</li>
  <li>Java deployment rule sets</li>
</ul>

#### Java SE 8
Java 8 was released on March 18, 2014, and included some features that were planned for Java 7 but later deferred.
<ul>
  Work on features was organized in terms of JDK Enhancement Proposals (JEPs).
  <li>JSR 335, JEP 126: Language-level support for lambda expressions which allow the addition of methods to interface without breaking existing implementations.</li>
  <li>Project Nashorn, a JavaScript runtime which allows developers to embed JavaScript code within applications</li>
  <li>Annotations on Java types</li>
  <li>Unsigned integer arithmetic</li>
  <li>Repeating annotations</li>
  <li>Data and time API</li>
  <li>Statically-linked JNI libraries</li>
  <li>Launch JavaFX applications</li>
  <li>Remove the permanent generation</li>
</ul>

#### Java SE 9
Java 9 was released on September 21, 2017 after several times got postponed. Java 9 should include better support for multi-gigabytes heaps, better native code integration, a different dfefault garbage collector and a self-tuning JVM.

<ul>
  <li>Mondularization of the JDK under Project Jigsaw</li>
  <li>jshell: The Java Shell</li>
  <li>Ahead-of-time compilation</li>
  <li>XML catalogs</li>
  <li>MOre concurrency updates. It inculdes a Java implementation of Reactive Streams, including a new Flow class that include the interfaces previously provided by Reactive Streams</li>
  <li>Variable handles: define a standard means to invoke the equivalents of various java.util.concurrent.atomic and sun.misc.Unsafe operations</li>
  <li>Jilink: The Java Linker: create a tool can assemble and optimize a set of modules and their dependencies into a custom run-time image. It effectively allows tp produce a fully usable executable including the JVM to run it</li>
  <li>JavaDB was removed drom JDK</li>
  <li>HiDPI graphics: automatic scalling and sizing</li>
</ul>
   
#### Java SE 10
OpenJDK 10 was released on March 20, 2018, with twelve new features confirmed. Among these features were:
<ul>
  <li>Local-variable tyoe inference</li>
  <li>Experimental Java-based JIT compiler. This is the integration of the Graal dynamic compiler for the Linux x64 platform</li>
  <li>Application class-data sharing. Allows application classes to be placed in the shared archive to reduce startup and footprint for Java applications</li>
  <li>Time-based release versioning</li>
  <li>Paralled full GC for G1</li>
  <li>Garbage-collector interface</li>
  <li>Additional Unicode language-tag extensions</li>
  <li>Root certificates</li>
  <li>Thread-local handshakes</li>
  <li>Heal allocation on alternative memory devices</li>
  <li>Remove the native-header generation tool -javah</li>
  <li>Consolidate the JDK forest into a single repository</li>
</ul>

#### Java SE 11
JDK 11 was released on September 25, 2018 and the version is currently open for bug fixes. Among others, Java 11 includes a number of new features, such as:

<ul>
  <li>JEP 309: Dynamic class-file constants</li>
  <li>JEP 318: Epsilon: a no-op garbage collector</li>
  <li>JEP 323: Local-variable sdyntax for lambda parameters</li>
  <li>JEP 331: Low-overhead heap profiling</li>
  <li>JEP 321: HTTP client (standard)</li>
  <li>JEP 332: Transport layer Security (TLS) 1.3</li>
  <li>JEP 328: Flight recorder</li>
  <li>JEP 333: ZGC: a scalable low-latency grabage collector</li>
  <li>JavaFX, Java EE and CORBA modules have been removed from JDK</li>
  <li>JEP 335: Deprecated the Nashor JavaScript engine</li>
  <li>Unicode 10.0.0 support </li>
</ul>

#### Java SE 12
JDK 12 was released on March 19, 2019, Among other, Java 12 includes a number of new features, such as:

<ul>
  <li>JEP 189: Shenandoah: a Low-Pause-Time Garbage Collector (Experimental)</li>
  <li>JEP 230: Microbenchmark Suite</li>
  <li>JEP 325: Switch Expressions (Preview)</li>
  <li>JEP 334: JVM Constants API</li>
  <li>JEP 340: One AArch64 Port, Not Two</li>
  <li>JEP 341: Default CDS Archives</li>
  <li>JEP 344: Abortable Mixed Collections for G1</li>
  <li>JEP 346: Promptly Return Unused Committed Memory from G1</li>
</ul>
