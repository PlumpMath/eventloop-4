libuv experiments
-----------------------

###### Quick Check

Just run the below command

 ```
 ./go
 ```

 ```
 >>> loaded libuv version 1.6.1
 ```

###### Notes

 From java interact with libuv library

```
 ./gradlew shadowJar
```

 You need to pass the path the library if it is not installed in the system library path already.

 You can easily do that with a system settings to java runtime, i.e.

```
 java -Djava.library.path=./lib  -jar build/libs/eventloop-all.jar
```

 Here I have checked in locally build libuv in my machine (mac)

 As of this writing, libuv can be installed using homebrew in mac.
