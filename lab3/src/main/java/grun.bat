SET CLASSPATH=.;C:/Javalib/antlr-4.9.3-complete.jar;%CLASSPATH%
@ECHO OFF
SET TEST_CURRENT_DIR=%CLASSPATH:.;=%
if "%TEST_CURRENT_DIR%" == "%CLASSPATH%" ( SET CLASSPATH=.;%CLASSPATH% )
@ECHO ON
java org.antlr.v4.gui.TestRig Expression s -gui