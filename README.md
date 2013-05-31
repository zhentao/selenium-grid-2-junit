selenium-grid-2-junit
=====================

The example to show how to use Selenium Grid 2 and junit.  Note this example can only be run on Mac machine.  The chromedriver 
used is for Mac only.  If want to run on different OS, need to download chromedriver from the following link:

http://code.google.com/p/chromedriver/downloads/list

How to run
=====================

1. Start hub on localhost:

./src/scripts/start-hub.sh

2. Start a node on localhost with 3 browsers (firefox, safari, chrome) configured.  The configuration file is
src/scripts/conf/nodeConfig.json.

./src/scripts/start-node.sh

3. Run the test in parallel using maven-surefire-plugin:

mvn test

