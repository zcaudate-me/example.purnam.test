# purnam-karma-testing

Example of how to test clojurescript code using the karma test framework.

## Usage

Clone this project and compile using cljsbuild:

    > git clone https://github.com/zcaudate/purnam-karma-testing.git
    > cd purnam-karma-testing
    > lein cljsbuild auto
    
In a new window in the same directory:

    > karma start

Tests are defined in `test/purnam_karma_testing/core_test.cljs`

## License

Copyright © 2013 Chris Zheng

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
