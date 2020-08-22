package o6_Git;
public class GitCommands {}
					


/*
					Check Git Version
					
					git --version
					
					Install Git & Upgrade Git
					
					brew intstall git
					brew upgrade git
					
					If it want user and email
					
					git config --global user.name "BobIT37"
					git config --global user.email "email@sample.com"
					
					PUSH
					
					git init
					git status
					git remote repo
					git add .
					git status
					git commit -m "message"
					git log
					git push origin master
					
					
					UPDATE
					
					cd folder
					git status
					git add .
					git status
					git commit -m "message"
					git push origin master
					
					
					CREATE BRANCH
					
					git branch login ==== create a branch
					
					git branch -a === check how many branches you have
					git branch
					
					git checkout 'login' == switch to branch
					
					git log
					
					git branch
					
					PUSH to code to ANOTHER BRANCH
					
					git status
					git add .
					git commit -m ''
					git push origin login (new branch name)
					
					
					DELETE BRANCH
					
					git branch -D login
					git push origin --delete 'login'
					
					CLONE
					
					Copy foolder path and use cd on the terminal
					git clone repo url
					
					
					EMAIL NOTIFICATION
					
					Github > Your Project > Settings > Notifications > add email
					
					CONFLICT
					
					cd Desktop
					mkdir conflict
					echo "line1" >> ilhan.txt
					cd conflict/
					echo "line1" >> ilhan.txt
					git init
					git add .
					git commit -m "first"
					echo "line2">> ilhan.txt
					cat ilhan.txt
					git commit -am "second"
					git checkout -b morelines
					echo "line3">> ilhan.txt
					git commit -am "third"
					git checkout master
					echo "line4">> ilhan.txt
					git commit -am "fourth"
					git merge morelines
					open ilhan.txt
					git merge morelines
					git add .
					git merge morelines
					git commit -am "alo"
					git merge morelines
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
*/