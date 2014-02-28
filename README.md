# example.purnam.test

[![Build Status](https://travis-ci.org/purnam/example.purnam.test.png?branch=master)](https://travis-ci.org/purnam/example.purnam.test)

Example of how to test clojurescript code using the karma test framework.

## Usage

Clone this project and compile using cljsbuild:

    > git clone https://github.com/purnam/example.purnam.test.git
    > cd example.purnam.test
    > lein cljsbuild auto
    
In a new window in the same directory:

    > karma start

Tests are defined in the `test/example/` directory.

## Document Generation

To generate a API Document from your tests, run the following in your project root:

    > mkdir doc
    > lein midje-doc

A html file will be created at `/doc/index.html`. This is generated directly from the unit test file at `/test/example/test_sweet_doc.cljs`. The generated output can be seen [here](http://purnam.github.io/example.purnam.test/).

## Tutorial

There is a quick video showing how to get the testing framework set up and a typical workflow:
[![ScreenShot](https://raw.github.com/purnam/example.purnam.test/master/karma-testing.png)](http://www.youtube.com/watch?v=9mryE5vggR0&feature=youtu.be)

## License

Copyright © 2014 Chris Zheng

Distributed under the The MIT License.
