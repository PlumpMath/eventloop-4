LibUV experiments
-----------------------

From java interact with libuv library

./gradlew shadowJar


You need to pass the path the library if it is not installed in the system library path already.

You can easily do that with a system settings to java runtime, i.e.

java -Djava.library.path=./lib  -jar build/libs/eventloop-all.jar
