#!/bin/sh

./gradlew shadowJar && java -Djava.library.path=./lib  -jar build/libs/eventloop-all.jar