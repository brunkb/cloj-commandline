# cloj-commandline-example

A little example to show how to create a command line program in Clojure and instead of having to write a .sh (or .bat) file
with java -jar some.jar in order to run it, we instead can use the lein-bin plugin to further package the program such 
that it can appear to be like any other command line program on the system.  In this case, I named the program 'ccle.'

I read about the idea here:
http://yobriefca.se/blog/2014/03/02/building-command-line-apps-with-clojure/

lein-bin plugin for leinengen:  https://github.com/Raynes/lein-bin

## A word on Non-Container Execution

Over the past couple of years, I have worked on quite a few enterprise web applications that run in a servlet container on 
Tomcat, Jetty, and Websphere.  But in addition to those types of applications, I have also written a good number of what
I refer to as 'batch' applications, which also use many of the same frameworks as their web-enabled cousins.  These small
ETL and data moving type programs act as the integration glue within an organization and often run as a daemon or 
via a scheduler such as cron.    

## Usage

ccle     | Runs the program
ccle -h  | Displays usage and then exits


## License

Copyright © 2014 Benjamin Brunk

Distributed under the Eclipse Public License either version 1.0 or any later version.
