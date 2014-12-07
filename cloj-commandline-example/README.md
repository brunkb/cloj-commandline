# cloj-commandline-example

A little example to show how to create a command line program in Clojure and instaed of having to write a .sh (or .bat) file
with java -jar some.jar in order to run it, we instead can use the lein-bin plugin to further package the program such 
that it can appear to be like any other command line program on the system.  In this case, I named the program 'ccle.'

I got the idea here:
http://yobriefca.se/blog/2014/03/02/building-command-line-apps-with-clojure/

lein-bin plugin for leinengen:  https://github.com/Raynes/lein-bin

## Usage

ccle     | Runs the program
ccle -h  | Displays usage and then exits


## License

Copyright © 2014 Benjamin Brunk

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
