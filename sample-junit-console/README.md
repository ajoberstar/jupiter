# JUnit Console Sample

[Official JUnit Console Docs](http://junit.org/junit5/docs/current/user-guide/#running-tests-console-runner)

This project is set up to create a Java application that has the JUnit launcher API and the Jovial engines on the
classpath. You can run it as follows:

```
./junit-console --help
```

The above will run the Gradle project that's here to package everything up, and execute the JUnit console with any
arguments you provide.

## Run clojure.test

There are sample `clojure.test` tests in the `clojure.test` directory. Just add those to the classpath and run all tests,
as follows:

```
./junit-console --cp clojure.test
```

You'll see the basic console output from JUnit with any failures or messages from `clojure.test`.