Jira-Jenkins-Plugin
-------------------

The Jira-Jenkins-Plugin integrates all necessary information from the continuous integration server Jenkins 
into the Jira Dashboard. 
This way, everybody can check at a glance the state and health of your build. 

Modules
-------

Jenkins Job Overview (Gadget):
	Shows status, last success and last failure of Jenkins jobs. Also allows to trigger a new build.

Recent Jenkins Builds (Gadget):
	Shows recent builds on Jenkins, optionally for a specific view or job.
	
Jenkins Charts (Gadget):
	Shows charts and trends from build statistics.
	
JenkinsInstancesServlet:
	Allows configuration of to the Gadgets of the Jira-Jenkins-Plugin available Jenkins-Instances.
	Available under Administration / Plugins / Jenkins-Instances
	
Jira-Version
------------

Requires Jira 4.4
Upon release of Jira 5.0 final update to 5.0 is planed.

Licensing
---------

Please see the file called LICENSE.

Installation
-------

TODO

Getting Started
---------------

As admin you might want to go to Administration/Plugins/Jenkins-Instances and make some jenkins-instances 
available to the gadgets.

Go to your dashboard.
Click on "Add Gadget" and select the gadget you want to display on your dashboard.
Go to the edit-page of the displayed gadget, in the upper righthand corner of the gadget.
Enter the required fields and select save. 
The gadget should now display the data from the jenkins-server.