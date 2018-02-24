# Compojure-api OutOfMemoryError example with spec coercion

## Usage

### Run the application locally

`lein ring server`

### Run the http client

`./post.sh`

### Watch the gc status

This shell script post message repeatedly. You can use java tool `jstat -gc PID` to watch the GC status. It is full GC frequently about 20 minutes later on my computer, and CPU load becomes very high. And then throw OutOfMemoryError exception about two hours later.
