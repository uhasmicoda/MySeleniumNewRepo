**1 Git**



**Git is a distributed version control system. It’s mainly used to track changes in code, manage different versions of a project, and allow multiple people to work on the same codebase at the same time without conflicts.**



**GitHub is a cloud-based platform built on top of Git. It provides a place where we can store our code repositories online, collaborate with team members, review code through pull requests, and manage issues or tasks. Basically, Git is the version control system, and GitHub is the platform that makes collaboration and project management easier**



**Git is a distributed version control system that we use to manage our code. In my projects, we used Git with platforms like GitHub. Whenever we worked on a new feature or bug fix, we created separate branches, and once the work was done, we merged them into the main branch through pull requests. During this process, I also handled conflicts when multiple people worked on the same files. Git helped us keep track of changes, roll back if something went wrong, and made collaboration between developers and testers much easier.**



**ONE BASIC FLOW OF GIT**



**# Git Branching and Merging Workflow**



**# ONE BASIC FLOW OF GIT**



**## Git Branching and Merging Workflow**



**| Step | Command / Action                  | Description                            |**

**| ---- | --------------------------------- | -------------------------------------- |**

**| 1    | `git init`                        | Initialize empty Git repository        |**

**| 2    | `git checkout -b b1`              | Create and switch to branch `b1`       |**

**| 3    | Create `b1.txt` in Notepad        | Write one line in the file and save    |**

**| 4    | `git add b1.txt`                  | Stage the file for commit              |**

**| 5    | `git commit -m "Added b1.txt"`    | Commit the file to `b1` branch         |**

**| 6    | `git checkout -b b2`              | Create and switch to branch `b2`       |**

**| 7    | Create `b2.txt` in Notepad        | Write one line in the file and save    |**

**| 8    | `git add b2.txt`                  | Stage the file                         |**

**| 9    | `git commit -m "Added b2.txt"`    | Commit the file to `b2` branch         |**

**| 10   | `git checkout -b b3`              | Create and switch to branch `b3`       |**

**| 11   | Create `b3.txt` in Notepad        | Write one line in the file and save    |**

**| 12   | `git add b3.txt`                  | Stage the file                         |**

**| 13   | `git commit -m "Added b3.txt"`    | Commit the file to `b3` branch         |**

**| 14   | `git checkout -b master`          | Create and switch to master branch     |**

**| 15   | `git merge b1`                    | Merge `b1` into master                 |**

**| 16   | `git merge b2`                    | Merge `b2` into master                 |**

**| 17   | `git merge b3`                    | Merge `b3` into master                 |**

**| 18   | `git branch -d b1`                | Delete branch `b1`                     |**

**| 19   | `git branch -d b2`                | Delete branch `b2`                     |**

**| 20   | `git branch -d b3`                | Delete branch `b3`                     |**

**| 21   | `ls` / `cat b1.txt b2.txt b3.txt` | Verify all files are present in master |**









**| \*\*Category\*\*         | \*\*Command\*\*                              | \*\*Description\*\*                                                |**

**| -------------------- | ---------------------------------------- | -------------------------------------------------------------- |**

**| \*\*Repo Setup\*\*       | `git init`                               | Initialize a new Git repository.                               |**

**|                      | `git clone <repo\_url>`                   | Clone an existing repository.                                  |**

**| \*\*Configuration\*\*    | `git config --global user.name "Name"`   | Set username for all repos.                                    |**

**|                      | `git config --global user.email "Email"` | Set email for all repos.                                       |**

**| \*\*Status/Info\*\*      | `git status`                             | Show working directory status.                                 |**

**|                      | `git log`                                | Show commit history.                                           |**

**|                      | `git log --oneline --graph --all`        | Compact history in tree format.                                |**

**|                      | `git diff`                               | Show unstaged changes.                                         |**

**| \*\*Staging \& Commit\*\* | `git add <file>`                         | Add file(s) to staging area.                                   |**

**|                      | `git add .`                              | Stage all changes.                                             |**

**|                      | `git commit -m "message"`                | Commit staged changes with message.                            |**

**|                      | `git commit --amend`                     | Edit last commit message or add forgotten changes.             |**

**| \*\*Branching\*\*        | `git branch`                             | List all branches.                                             |**

**|                      | `git branch <name>`                      | Create a new branch.                                           |**

**|                      | `git checkout <branch>`                  | Switch to a branch.                                            |**

**|                      | `git checkout -b <branch>`               | Create and switch to new branch.                               |**

**|                      | `git switch <branch>`                    | Switch to a branch (newer syntax).                             |**

**|                      | `git switch -c <branch>`                 | Create and switch to a new branch.                             |**

**| \*\*Merging\*\*          | `git merge <branch>`                     | Merge a branch into current one.                               |**

**|                      | `git rebase <branch>`                    | Reapply commits on top of another branch.                      |**

**| \*\*Remote\*\*           | `git remote -v`                          | Show remote repositories.                                      |**

**|                      | `git remote add origin <url>`            | Add remote repository.                                         |**

**|                      | `git push origin <branch>`               | Push branch to remote.                                         |**

**|                      | `git push -u origin <branch>`            | Push branch \& set upstream.                                    |**

**|                      | `git pull`                               | Fetch + merge changes from remote.                             |**

**|                      | `git fetch`                              | Download changes without merging.                              |**

**| \*\*Undo/Reset\*\*       | `git reset <file>`                       | Unstage a staged file.                                         |**

**|                      | `git reset --hard <commit>`              | Reset repo to a specific commit (dangerous, discards changes). |**

**|                      | `git restore <file>`                     | Restore file from last commit.                                 |**

**|                      | `git revert <commit>`                    | Create a new commit that undoes changes from a commit.         |**

**| \*\*Tagging\*\*          | `git tag <name>`                         | Create a tag.                                                  |**

**|                      | `git tag`                                | List tags.                                                     |**

**|                      | `git push origin <tag>`                  | Push a tag to remote.                                          |**

**| \*\*Stash\*\*            | `git stash`                              | Save changes temporarily.                                      |**

**|                      | `git stash pop`                          | Reapply stashed changes.                                       |**

**|                      | `git stash list`                         | Show stashed changes.                                          |**

**| \*\*Clean Up\*\*         | `git branch -d <branch>`                 | Delete branch (safe).                                          |**

**|                      | `git branch -D <branch>`                 | Force delete branch.                                           |**

**|                      | `git rm <file>`                          | Remove file and stage removal.                                 |**









