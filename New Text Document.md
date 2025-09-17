**1 Git**



**Git is a distributed version control system. It’s mainly used to track changes in code, manage different versions of a project, and allow multiple people to work on the same codebase at the same time without conflicts.**



**GitHub is a cloud-based platform built on top of Git. It provides a place where we can store our code repositories online, collaborate with team members, review code through pull requests, and manage issues or tasks. Basically, Git is the version control system, and GitHub is the platform that makes collaboration and project management easier**



**Git is a distributed version control system that we use to manage our code. In my projects, we used Git with platforms like GitHub. Whenever we worked on a new feature or bug fix, we created separate branches, and once the work was done, we merged them into the main branch through pull requests. During this process, I also handled conflicts when multiple people worked on the same files. Git helped us keep track of changes, roll back if something went wrong, and made collaboration between developers and testers much easier.**



**ONE BASIC FLOW OF GIT**



**# Git Branching and Merging Workflow**



**# 🚀 Git Commands Cheat Sheet**



**| \*\*Category\*\*         | \*\*Command\*\*                              | \*\*Description\*\*                              |**

**| -------------------- | ---------------------------------------- | -------------------------------------------  |**

**| \*\*Repo Setup\*\*       | `git init`                               | Initialize a new repository                  |**

**|                      | `git clone <repo\_url>`                   | Clone an existing repository                 |**

**| \*\*Configuration\*\*    | `git config --global user.name "Name"`   | Set username for all repos                   |**

**|                      | `git config --global user.email "Email"` | Set email for all repos                      |**

**| \*\*Status / Info\*\*    | `git status`                             | Show working directory status                |**

**|                      | `git log`                                | Show commit history                          |**

**|                      | `git log --oneline --graph --all`        | Compact history in tree format               |**

**|                      | `git diff`                               | Show unstaged changes                        |**

**| \*\*Staging \& Commit\*\* | `git add <file>`                         | Add file(s) to staging area                  |**

**|                      | `git add .`                              | Stage all changes                            |**

**|                      | `git commit -m "message"`                | Commit staged changes with message           |**

**|                      | `git commit --amend`                     | Edit last commit or add forgotten changes    |**

**| \*\*Branching\*\*        | `git branch`                             | List all branches                            |**

**|                      | `git branch <name>`                      | Create a new branch                          |**

**|                      | `git checkout <branch>`                  | Switch to a branch                           |**

**|                      | `git checkout -b <branch>`               | Create \& switch to a new branch              |**

**|                      | `git switch <branch>`                    | Switch to a branch (new syntax)              |**

**|                      | `git switch -c <branch>`                 | Create \& switch to a new branch (new syntax) |**

**| \*\*Merging\*\*          | `git merge <branch>`                     | Merge a branch into current one              |**

**|                      | `git rebase <branch>`                    | Reapply commits on top of another branch     |**

**| \*\*Remote\*\*           | `git remote -v`                          | Show remote repositories                     |**

**|                      | `git remote add origin <url>`            | Add a remote repository                      |**

**|                      | `git push origin <branch>`               | Push branch to remote                        |**

**|                      | `git push -u origin <branch>`            | Push branch \& set upstream                   |**

**|                      | `git pull`                               | Fetch + merge changes from remote            |**

**|                      | `git fetch`                              | Download changes without merging             |**

**| \*\*Undo / Reset\*\*     | `git reset <file>`                       | Unstage a staged file                        |**

**|                      | `git reset --hard <commit>`              | Reset repo to specific commit (dangerous)    |**

**|                      | `git restore <file>`                     | Restore file from last commit                |**

**|                      | `git revert <commit>`                    | Create new commit that undoes a commit       |**

**| \*\*Tagging\*\*          | `git tag <name>`                         | Create a tag                                 |**

**|                      | `git tag`                                | List tags                                    |**

**|                      | `git push origin <tag>`                  | Push a tag to remote                         |**

**| \*\*Stash\*\*            | `git stash`                              | Save changes temporarily                     |**

**|                      | `git stash pop`                          | Reapply stashed changes                      |**

**|                      | `git stash list`                         | Show stashed changes                         |**

**| \*\*Clean Up\*\*         | `git branch -d <branch>`                 | Delete branch (safe)                         |**

**|                      | `git branch -D <branch>`                 | Force delete branch                          |**

**|                      | `git rm <file>`                          | Remove file and stage removal                |**







