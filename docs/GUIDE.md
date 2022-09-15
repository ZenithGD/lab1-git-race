# GUIDE

This is the repository that we will use for the first assignment of the course 2022-2023. This guide is command line oriented, but you are free to use IDE like _VS Code_, _IntelliJ IDEA_ and _Eclipse_ which have full support of the tools that we are going to use. We also assume that you have installed in your box at least [Kotlin 1.7.0](https://kotlinlang.org/docs/getting-started.html#install-kotlin).

This is a speed competition.
The quicker will do less work and will be more easily to them to pass it.
You can browse the [src](../src) folder.
The code is not documented, and I expect that you document it without breaking it.
Each student should add a few lines (minimum 100 words) of documentation and code to the code and to [description.md](../description.md) that can be considered as an __ENHANCEMENT__. Documentation __MUST__ follow [Kotlin best practices](https://kotlinlang.org/docs/kotlin-doc.html) in Java files and use [GitHub Markdown](https://guides.github.com/features/mastering-markdown/) in `.md` files.

The topics expected are:

* How to build the code.
* How to test the code.
* How to deploy the code in a server.
* Which are the technologies used in the code.
* How these technologies work.
* What means each a specific piece or code.
* Which is the purpose of a specific Java annotation.
* ...

The documentation should be added to the file ([description.md](../description.md)) or to files in the folder [src](../src/) and must be written in English (B1 level of course!).

And remember, if you add outstanding information you will have a cumulative bonus of 5% in your personal score in the evaluation of the project. A work is considered outstanding when:

* It can be used really as reference documentation by your fellows, and/or
* It contains a new piece of working and tested code (it must follow [TDD](https://en.wikipedia.org/wiki/Test-driven_development) best practices), and/or
* It goes further with _git_, _Gradle_ or _GitHub Actions_

People deserving the cumulative bonus will be announced here, in the Score column.

If you do not submit anything before October, 30th you will suffer a penalty of 20% in your personal score for the evaluation of the _URLShortener_ project.
As this is your first lab, this penalty will be effective if and only if you have not attempted to submit something that have some value.

If you have any doubt about the procedure post an [Issue](https://github.com/UNIZAR-30246-WebEngineering/lab1-git-race/issues).

## Set up git

The first step is setting up [git](https://git-scm.com/). This is a _git_ repository. First, you’ll need to sign up for an account on [GitHub.com](https://github.com). Let's imagine that you account is named `your-github-username`.

Install _git_ for Windows, Mac or Linux as [needed](https://git-scm.com/downloads).
Next, in your console type:

```bash
git config --global user.name "Your real Here"
git config --global user.email "your_email@youremail.com"
git config --global push.default simple
```

Next you must configure your preferred way to connecting _GitHub_: _HTTPS_ ([tutorial](https://help.github.com/articles/caching-your-github-password-in-git/)) or _SSH_ ([tutorial](https://help.github.com/articles/generating-ssh-keys/)).
Now you can create your own online repository on _GitHub_ ([tutorial](https://help.github.com/articles/create-a-repo/)).

## Fork this repository

Forking this repository is very easy.
First click on the right-top corner of the page _Fork_.
That's it!.
Now you have <https://github.com/UNIZAR-30246-WebEngineering/lab1-git-race> cloned in `https://github.com/your-github-username/lab1-git-race`
Next you need to keep your fork synced. We assume here that you have set up _git_ in your computer.

```bash
git clone https://github.com/your-github-username/lab1-git-race
cd lab1-git-race
git remote add upstream https://github.com/UNIZAR-30246-WebEngineering/lab1-git-race.git
```

## Keep synced this repository

Do the following steps to keep your repo synced.

```bash
cd lab1-git-race
git fetch upstream
git checkout main
git merge upstream/main
```

## Setting up Gradle

[Gradle](http://gradle.org/) is the building tool used in this course.
It is like a Swiss Army knife for building software from the command line.
 _Gradle_ is configured by adding a file named `gradle.build.kts` to the root directory of a project, which is written in [Kotlin DSL](https://docs.gradle.org/current/userguide/kotlin_dsl.html).
 Please, refer to the [Gradle user guide](https://docs.gradle.org/current/userguide/installation.html) for its installation.
 Once it is installed just do a first run for checking the code:

```bash
cd lab1-git-race
gradle check
```

## Upload your changes

In order to check that _GitHub Actions_ is working well modify locally `README.md` and add to the table the following [Markdown](https://help.github.com/articles/github-flavored-markdown/) code:

```markdown
[your-github-username](https://github.com/your-github-username/lab1-git-race) |your NIA | [![Build Status](https://github.com/your-github-username/lab1-git-race/actions/workflows/ci.yml/badge.svg)](https://github.com/your-github-username/lab1-git-race/actions/workflows/ci.yml)
(https://travis-ci.org/your-github-username/lab1-git-race)
```

Next add your changes into your local repository:

```bash
cd lab1-git-race
git add -A
git commit -m "with a concise description of the commit"
```

And then push them to your online _lab1-git-race_ repository in __GitHub__:

```bash
git push
```

The file `README.md` in your _GitHub_ repository will be updated, and _GitHub Actions_ will start to build and test your code. Soon your badge will turn green if you refresh your browser. Otherwise, it means that you have done something wrong.

## Complete the documentation

Now is time to review the code and look for relevant and correct information. Once your have updated locally ensure that you code works with `gradle check` and if it works do a `git push`.

## Do a pull request

Finally, you must make a pull request. Go to your `your-github-username/lab1-git-race` repository in __GitHub__ and click on the green icon on the left. Create a pull request so that we can check your changes and accept them in this repository. If everything is ok, your changes will be added. If not, you will receive a message explaining why not.

The most three common reason for rejecting your request are:

* You are not adding __NEW__ and __CORRECT__ information.
* Your request cannot be automatically merged.
  The fix is easy.
  Sync your local repository with <https://github.com/UNIZAR-30246-WebEngineering/lab1-git-race>, then upload your changes, and finally perform the pull request.
* Your __GitHub Actions__ status is not green
  Check why it doesn't work and fix it!
