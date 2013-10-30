# purnam-karma-testing

Example of how to test clojurescript code using the karma test framework.

## Usage

Clone this project and compile using cljsbuild:

    > git clone https://github.com/zcaudate/purnam-karma-testing.git
    > cd purnam-karma-testing
    > lein cljsbuild auto
    
In a new window in the same directory:

    > karma start

Tests are defined in `test/purnam_karma_testing/core_test.cljs`.

There is a quick video showing how to get the testing framework set up and a typical workflow:
[![ScreenShot](https://raw.github.com/zcaudate/puram-karma-testing/master/karma-testing.png)](http://www.youtube.com/watch?v=mhBqjJUYY6w)


## License

Copyright © 2013 Chris Zheng

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
