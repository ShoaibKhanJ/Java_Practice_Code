# YouTube Content Management System

A Java-based console application built to practice and demonstrate Object-Oriented Programming (OOP) concepts through a simplified YouTube video management system.

This project is part of my Java learning journey as a BS Computer Science student.

## About the Project

The application models different types of YouTube videos, including regular videos and premium videos.

It focuses on implementing Java OOP concepts through practical coding rather than simply studying theory.

## Technologies Used

- Java
- VS Code / IntelliJ IDEA
- Git & GitHub

## Current Features

- Create video objects.
- Store video titles and view counts.
- Store channel names, likes, and comments.
- Create premium video objects.
- Track the total number of videos using a static variable.
- Display video details.
- Use inheritance to organize video types.

## OOP Concepts Implemented

| Concept | Status |
|---|---|
| Classes and Objects | ✅ Completed |
| Constructors | ✅ Completed |
| `this` Keyword | ✅ Completed |
| Access Modifiers | ✅ Basic implementation |
| Static Variables and Methods | ✅ Completed |
| Inheritance | ✅ Completed |
| Multilevel Inheritance | ✅ Implemented |
| `super` Keyword | ✅ Implemented |
| Constructor Chaining | ✅ Implemented |
| Method Overriding | 🚧 In progress |
| Dynamic Method Dispatch | ⏳ Planned |

## Project Structure

```text
YouTube-Content-Management-System/
│
├── Main.java
└── README.md
```

### Class Hierarchy

```text
Video
  |
  └── YouTubeVideo
          |
          └── PremiumVideo
```

- **Video:** Base class containing common video information.
- **YouTubeVideo:** Extends Video and adds channel information, likes, and comments.
- **PremiumVideo:** Extends YouTubeVideo and adds premium-specific properties.

## Learning Roadmap

- [x] Classes and Objects
- [x] Constructors
- [x] Static and Instance Members
- [x] Inheritance
- [x] Multilevel Inheritance
- [x] Constructor Chaining
- [ ] Method Overriding
- [ ] Dynamic Method Dispatch
- [ ] Superclass References
- [ ] Improve Encapsulation
- [ ] Add More Functionality

## Future Improvements

- Improve code organization.
- Implement better encapsulation.
- Add more video-related functionality.
- Improve the console interface.
- Explore additional OOP concepts.
- Expand the project as my Java knowledge grows.

## Project Status

<ins>Actively Developing</ins>

This project is continuously updated as I learn new Java concepts and improve my programming skills.

## Author

**Shoaib Khan Jamali**

BS Computer Science Student | Java Learner | Aspiring Software Engineer

- GitHub: [ShoaibKhanJ](https://github.com/ShoaibKhanJ)
- LinkedIn: [Connect with me](https://www.linkedin.com/)

---

*Built with Java. Improved with every commit.*