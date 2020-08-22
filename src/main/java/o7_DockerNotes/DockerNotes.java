package o7_DockerNotes;
public class DockerNotes {}

/*

	DOCKER 
	
		Zombi Server --> 
		
		Virtual MAchine --> 
			
			Hypervisor technology : working seperartely in the same machine. 
									Oracle virtual box, vmware, Microsoft Hyper-V 
									
			AWS :  -these topics are very important!:-
				* How to install/set up an application/machine on the AWS and 
				* how to access it and 
				* how to test it. 
									
			
		DOCKER : 
				- D is a big container
				- D free
				- in D there are a lot of images containers. every containers represent a companents / an application.
				- if you want to use another virtual machine in your computer;
					= you must seperate your host rem storage like 4 gb for Windows, 2 gb for Linux etc. 
					= you have to install and wait for set up applicatin every time like if you want to use Linux.
					But Docker has container system. You don't have to install any operating system, or application.
				- D uses Container Engine technology : provides to connection your container to your host operation system : if you want to use Ubuntu, just need to open terminal and run command to install Ubuntu, that's it.
				- D uses host futures and technologies only using time. But virtual machines use always. 
				- In the market there are two  different Docker technology:
					1. LXC - Linux Containers 	--> free, so most common. 
					2. Microsoft Server Containers
	
	
	
			VIRTUAL MACHINE														DOCKER CONTAINERS
	
	- Hardware-level process isolation								- OS level process isolation
		(you have to seperate your host storage)						(you can use your host operation system for every  operation even the others went bad.)
	- Each VM has separate OS										- Each container can share OS
	- Boots in minutes 	(it starts in minutes)						- Boots in seconds (it starts in seconds, faster)
	- VMs are of few GBs as a REM, storage, CPU						- Containers are lightweight(just KBs/MBs, faster, consume less properties in your system)
	- Creating VM takes a relatively longer time					- Containers can be created in seconds (faster)
	- More resource  usage 											- Less resource  usage 
	- VMs can move to new host easily								- Containers are destroyed and re-created rather than moving (dis-advantages)
	- More secure (Cloud and Hypervisor is good)					- Not secure 
	
	
	
	
	On Terminal :
	
	= docker
	= docker --version
	= docker ps        					: ps shows list in docker containers.
	= docker pull hello-world			: pull command - image'i install ettik. 
	= docker ps 						: run etmedigimiz icin yine listede gorunmez. 
	= docker run hello-world			: simdi run ettik artik listede gorebiliriz and kullanabiliriz. we create container. 
	= docker ps 						: check it. still can't see. hala run edeneleri goremiyoruz.
	= docker ps -a 						: now we can see hello-world image in the storage. 
	
	= docker pull seqvence /static-site	: install another greeting image
	...
	= docker run -d -P seqvence/static-site		: create port number. then go browser and write -->  IPadress:portNumber 
	= ifconfig |grep inet 				: to get IP number 
	
	
	to Install Ubuntu : 
	
	= docker pull ubuntu
	= docker images
	= docker ps 						
	= docker ps -a 	
	
	= docker run -it -d ubuntu 		: 'it' means interaction terminal yani biz go to inside to Ubuntu with interaction command. 
	= docker ps -a 	
	= docker run -it ubuntu 		: we are in root 
	= ls 							: see all folder inside Ubuntu
	= cd home						: go to home folder
	= pwd 
	= apt update 					: to update all Ubuntu system
	= apt install nodejs			: to install nodejs 
	= node -v						: to check if you install node or not, see its version. 
	= exit 							: to exit Ubuntu and return host machine 
	
	= docker ps -a 					: see the items image IDs.
	= docker restart imageID		 
	= docker stop imageID
	= docker rm	imageID				: remove any thing from docker
	= docker rmi imageID			: remove image from docker 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


*/