# 🎬 YouTube Video Manager

A small console application that models YouTube-style videos in Java. It demonstrates core **object-oriented programming** concepts: encapsulation, inheritance, method overriding, constructor chaining and static members.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/Concept-OOP-2c5364?style=for-the-badge)
![Console App](https://img.shields.io/badge/Type-Console_App-203a43?style=for-the-badge)

---

## 📖 Overview

The program defines a three-level class hierarchy and creates several sample videos, printing the details of each one and the total number of videos created.

```
Video                  (base class)
 └── YouTubeVideo      (adds channel, likes, comments)
      └── PremiumVideo (adds premium features, subscription flag)
```

## ✨ Features

- **Encapsulation:** `title` and `views` are `private` in `Video`.
- **Inheritance:** `YouTubeVideo` extends `Video`, and `PremiumVideo` extends `YouTubeVideo`.
- **Constructor chaining:** each subclass calls `super(...)` to initialise inherited fields.
- **Method overriding:** `PremiumVideo` overrides `displayDetails()` with its own output.
- **Static members:** `total_videos` counts every object created, and `displayTotalVideos()` prints the count.

## 🧱 Class Reference

| Class | Extends | Key fields | Key methods |
|---|---|---|---|
| `Video` | n/a | `title`, `views`, static `total_videos` | `video_details()`, static `displayTotalVideos()` |
| `YouTubeVideo` | `Video` | `Channelname`, `video_likes`, `video_comments` | `displayDetails()` |
| `PremiumVideo` | `YouTubeVideo` | `premiumFeatures`, `subscriptionRequired` | `displayDetails()` (overridden) |
| `main` | n/a | n/a | `main(String[] args)` entry point |

## 🚀 Getting Started

### Prerequisites

- [Java JDK 8 or higher](https://www.oracle.com/java/technologies/downloads/)

### Run it

```bash
# 1. Save the code as Main.java, then compile
javac Main.java

# 2. Run
java main
```

> The entry-point class is named `main` (lowercase), so the run command uses `java main`.

## 🖥️ Sample Output

```
_______________________________________________
Title: How Java Actually Works
Views: 250000
Likes: 12500
Comments: 450
_______________________________________________
...
_______________________________________________
Title: Python for AI Beginners
Views: 430000
Premium Feature: 4K Quality
Subscription Required: true
_______________________________________________
...
Total Videos: 7
```

## 📂 Project Structure

```
.
├── Main.java    # Video, YouTubeVideo, PremiumVideo and main classes
└── README.md
```

## 🔧 Possible Improvements

- Have `PremiumVideo.displayDetails()` call `super.displayDetails()` so likes and comments are shown for premium videos too.
- Rename `main` to `Main` and `video_details()` to `videoDetails()` to follow Java naming conventions.
- Store videos in an `ArrayList<Video>` and loop over them instead of calling each `displayDetails()` by hand.
- Add getters and setters for the private fields.
- Move each class into its own file.

## 👤 Author

**Shoaib Khan**: [LinkedIn](https://www.linkedin.com/in/shoaibkj) • [Webica Studio](http://www.webicastudio.com)

---

⭐ If this helped you learn OOP in Java, consider giving the repo a star!
