![](.common/nsbanner.png?raw=true)

# Java Check Configuration

## History

* 1.0.0 Initial creation 2/28/2020.

## Introduction

This is a simple Maven/Gradle project with a class and test class using JUnit 5 (Jupiter) to check that a project may be imported,
the packages imported from Maven, the project builds, and the test runs correctly.
The project may be imported and build as a Maven or Gradle project, it has both pom.xml and build.gradle files.
It is also a good starting example for anything using JUnit 5 and Mockito, the pom.xml and build.gradle are already configured.

## Instructions

Basically you just need to import this project in Eclipse or IntelliJ, build, and run the test to make sure that everything is OK.
This project should work with JDK 8 or higher.

### Using Maven

Setting up a Maven project depends on the pom.xml file. This file carries the junit-platform-launcher as a dependency;
IntelliJ Idea does not need it but Eclipse does.

#### Eclipse

The support XML files to install the m2e git connector are presently broken at the Eclipse website, so the connector cannot be installed and
the project cannot be cloned using the import wizards in the IDE.
We promise to update the instructions when this gets fixed.
For now the project will have to be cloned manually:

1. Open Eclipse and select an existing workspace or make a new one. The project will be loaded into the workspace.
2. If you have git installed, the clone the project on the command line with *git cloe https://github.com/nextstepitt/java-check-config* in the current workspace directory, and skip to step 4.
3. If you do not have git installed, browse to *https://github.com/nextstepitt/java-check-config*, click the *Clone or Download* button and download a zip file of the project. Expand the project into the workspace directory. Rename the project folder to take away the *-master* that GitHub added to the end of the name.
4. Select the menu option *File &rightarrow; Import...*
5. Expand the *Markdown* folder in the *Import Wizard Types* dialog.
6. Choose *Existing Maven Projects* and click the *Next* button.
7. In the dialog click the *Browse* button and it will default to the workspace directory. Click the *Open* button.
8. Verify that the java-check-config project is selected. Click the *Finish* button.
9. In the project expand *src/test/java/com.wonderfulwidgets.checkconfig*.
10. Right click the file *HelloWorldTest* and select the menu option *Run as &rightarrow; JUnit Test* to verify the test runs.
11. You have completed the check.

#### IntelliJ Idea

1. Open IntelliJ Idea and on the splash page select the *Get from Version Control* to open a project.
2. In the dialog enter the URL for this project: *https://github.com/nextstepitt/java-check-config*
3. Set the directory to the directory that will contain the project folder when it is imported.
4. Click the *Clone* button.
5. The project will import. If IntelliJ Idea prompts for credentials, then the URL is wrong.
6. Give Maven a chance to load the packages and IntelliJ Idea a chance to build the project. If Maven asks to import changes, do it.
7. In the project expand *src/test/java/com.wonderfulwidgets.checkconfig*.
8. Right click the file *HelloWorldTest* and select the menu option *Run 'HelloWorldTest'* to verify the test runs.
9. You have completed the check.

### Using Gradle

Setting up a Gradle project depends on the build.gradle file. This file carries the junit-platform-launcher as a dependency;
IntelliJ Idea does not need it but Eclipse does.

#### Eclipse

The support XML files to install the m2e git connector are presently broken at the Eclipse website, so the connector cannot be installed and
the project cannot be cloned using the import wizards in the IDE.
We promise to update the instructions when this gets fixed.
For now the project will have to be cloned manually:

1. Open Eclipse and select an existing workspace or make a new one. The project will be loaded into the workspace.
2. If you have git installed, the clone the project on the command line with *git cloe https://github.com/nextstepitt/java-check-config* in the current workspace directory, and skip to step 4.
3. If you do not have git installed, browse to *https://github.com/nextstepitt/java-check-config*, click the *Clone or Download* button and download a zip file of the project. Expand the project into the workspace directory. Rename the project folder to take away the *-master* that GitHub added to the end of the name.
4. Select the menu option *File &rightarrow; Import...*
5. Expand the *Gradle* folder in the *Import Wizard Types* dialog.
6. Choose *Existing Gradle Project* and click the *Next* button.
7. Click the *Next* button on the "How to Experience the Best Gradle Integration" page.
8. In the dialog click the *Browse* button and select the project folder. Click the *Finish* button.
9. In the project expand *src/test/java/com.wonderfulwidgets.checkconfig*.
10. Right click the file *HelloWorldTest* and select the menu option *Run as &rightarrow; JUnit Test* to verify the test runs.
11. You have completed the check.

#### IntelliJ Idea

1. Open IntelliJ Idea and on the splash page select the *Get from Version Control* to open a project.
2. In the dialog enter the URL for this project: *https://github.com/nextstepitt/java-check-config*
3. Set the directory to the directory that will contain the project folder when it is imported.
4. Click the *Clone* button.
5. The project will import. If IntelliJ Idea prompts for credentials, then the URL is wrong.
6. Ignore any requests from Maven.
7. Right-click on the *build.gradle* file and select *Import Gradle Project*.
8. In the project expand *src/test/java/com.wonderfulwidgets.checkconfig*.
9. Right click the file *HelloWorldTest* and select the menu option *Run 'HelloWorldTest'* to verify the test runs.
10. You have completed the check.

## License

The example project is licensed under the MIT license. You may use and modify all or part of it as you choose, as long as attribution to the source is provided per the license. See the details in the [license file](./LICENSE.md) or at the [Open Source Initiative](https://opensource.org/licenses/MIT)

## Support

Since I give stuff away for free, and if you would like to keep seeing more stuff like this, then please consider
a contribution to *Joel's Coffee Fund* at **Smallrock Internet** to help keep the good stuff coming :)<br />

[![Donate](.common/Donate-Paypal.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=XPUGVGZZ8RUAA)

## Contributing

We are always looking for ways to make the template better. But remember: Keep it simple. Keep it minimal. Don't add every single feature just because you can, add a feature when a feature is required.

## Authors or Acknowledgments

* Joel Mussman
