# Java Lambda Request Response

[![Build Status](https://travis-ci.org/michaelruocco/java-lambda-request-response.svg?branch=master)](https://travis-ci.org/michaelruocco/java-lambda-request-response)
[![Coverage Status](https://coveralls.io/repos/github/michaelruocco/java-lambda-request-response/badge.svg?branch=master)](https://coveralls.io/github/michaelruocco/java-lambda-request-response?branch=master)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/6d33164f8a5343d8ac8e2dee6a4107f8)](https://www.codacy.com/app/michaelruocco/java-lambda-request-response?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=michaelruocco/java-lambda-request-response&amp;utm_campaign=Badge_Grade)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.michaelruocco/java-lambda-request-response/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.michaelruocco/java-lambda-request-response)

This project contains request and response objects that can be used when
writing AWS Lambda functions in Java.

## Usage

To use the library from a program you will need to add a dependency to your project. In
gradle you would do this by adding the following to your build.gradle file:

```
dependencies {
    compile 'com.github.michaelruocco:java-lambda-request-response:1.0.4'
}
```