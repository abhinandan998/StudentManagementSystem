# 📚 Student Management System

A console-based **Student Management System** built with Java that demonstrates core Object-Oriented Programming principles. This application allows users to register students, enroll them in courses, search for student information, and manage student records efficiently.

---

## 🌟 Features

- **Student Registration**: Register new students with validation for name, age, and student ID
- **Course Enrollment**: Enroll students in available courses (Java, DSA, DevOps)
- **Search Functionality**: Find student information by Student ID
- **List All Students**: View all registered students' information
- **Sorted Display**: Display students in alphabetical order by name
- **Input Validation**: Comprehensive validation using regular expressions and business rules

---

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, etc.) or command line

### Installation

1. Clone the repository:
```bash
git clone https://github.com/abhinandan998/StudentManagementSystem.git
```

2. Navigate to the project directory:
```bash
cd StudentManagementSystem
```

3. Compile the Java files:
```bash
javac src/com/Student/app/*.java
```

4. Run the application:
```bash
java -cp src com.Student.app.Main
```

---

## 💻 Usage

When you run the application, you'll see a menu with the following options:

```
1. Register a student
2. Find student information with studentId
3. List All Student Information
4. List Student information in sorted order
5. Exit
```

### Student Registration Example

- **Name**: Alphabets only (e.g., "Abhinandan Basu")
- **Age**: Must be between 19 and 35
- **Student ID**: Format must be `S-<number>` (e.g., "S-1234")
- **Courses**: Choose from Java, DSA, or DevOps

---

## 🏗️ Project Structure

```
StudentManagementSystem/
│
├── src/
│   └── com/
│       └── Student/
│           └── app/
│               ├── Main.java          # Entry point and menu-driven interface
│               └── Student.java       # Student class with attributes and methods
│
├── out/                               # Compiled class files
├── .gitignore
└── README.md
```

---

## 🎯 Object-Oriented Programming (OOP) Principles

This project demonstrates the four pillars of OOP:

### 1. **Encapsulation** 🔒
- **Private instance variables**: `name`, `age`, `studentId`, `courses` are declared as `private`, restricting direct access from outside the class
- **Getter methods**: Public methods like `getName()`, `getAge()`, `getStudentId()`, `getCourses()` provide controlled access to private data
- **Data hiding**: Internal implementation details are hidden from external classes

```java
private String name;
private int age;
private String studentId;
private List<String> courses;

public String getName() {
    return name;
}
```

### 2. **Abstraction** 🎭
- **Simplified interface**: Complex validation logic is abstracted into separate methods (`ValidateName()`, `ValidateAge()`, `validateStudentID()`)
- **Method abstraction**: The `enrollCourse()` method hides the complexity of course validation and enrollment
- **Data structure abstraction**: Uses `ArrayList` to abstract the complexity of managing course collections

```java
public void enrollCourse(String course) {
    if(validateCourseName(course)) {
        if (!courses.contains(course)) {
            courses.add(course);
            System.out.println("Student is enrolled to " + course + " successfully");
        }
    }
}
```

### 3. **Inheritance** 🧬
- **Object class inheritance**: The `Student` class implicitly extends the `Object` class
- **Method overriding**: The `toString()` method is overridden to provide custom string representation
- **Super constructor**: Uses `super()` to call the parent class constructor

```java
@Override
public String toString() {
    return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", studentId='" + studentId + '\'' +
            ", courses=" + courses +
            '}';
}
```

### 4. **Polymorphism** 🔄
- **Method overriding**: The `toString()` method demonstrates runtime polymorphism
- **Lambda expressions**: Used in sorting and filtering operations (e.g., `Comparator` for sorting students by name)
- **Stream API**: Utilizes polymorphic behavior with streams for searching students

```java
// Compile-time polymorphism through method overloading (implicit)
// Runtime polymorphism through lambda expressions and streams
Comparator<Student> studentNameComparator = (o1, o2) -> o1.getName().compareTo(o2.getName());

studentFound = studentList.stream()
    .filter(student -> student.getStudentId().equalsIgnoreCase(studentId))
    .findFirst()
    .orElseThrow(() -> new RuntimeException("No Student Data found !!!"));
```

---

## 🛡️ Validation Features

### Input Validation Using Regular Expressions

1. **Name Validation**:
   - Pattern: `^[a-zA-Z\\s]+$`
   - Allows only alphabets and spaces

2. **Student ID Validation**:
   - Pattern: `S-\\d+$`
   - Format: S-{numbers} (e.g., S-1234)

3. **Age Validation**:
   - Range: 19 to 35 years

4. **Course Validation**:
   - Allowed courses: Java, DSA, DevOps (case-insensitive)

---

## 🔧 Technologies Used

- **Language**: Java
- **Core Concepts**: 
  - Collections Framework (ArrayList, List)
  - Regular Expressions (Pattern, Matcher)
  - Stream API
  - Lambda Expressions
  - Exception Handling
- **Design Pattern**: Object-Oriented Design

---

## 📊 Key Functionalities

| Feature | Description |
|---------|-------------|
| **Register Student** | Add new student with validation |
| **Enroll Courses** | Enroll student in multiple courses |
| **Search by ID** | Find student using unique student ID |
| **List All Students** | Display all registered students |
| **Sorted List** | View students sorted alphabetically |
| **Input Validation** | Regex-based validation for all inputs |

---

## 🎓 Learning Outcomes

This project helps understand:

- ✅ Core OOP principles (Encapsulation, Abstraction, Inheritance, Polymorphism)
- ✅ Java Collections Framework
- ✅ Regular Expressions for input validation
- ✅ Stream API and Lambda expressions
- ✅ Exception handling
- ✅ Menu-driven console applications
- ✅ Data management and sorting

---

## 🚧 Future Enhancements

- [ ] Add database integration (MySQL/PostgreSQL)
- [ ] Implement student grade management
- [ ] Add attendance tracking system
- [ ] Create a GUI using JavaFX or Swing
- [ ] Add file-based persistence (JSON/CSV)
- [ ] Implement user authentication and authorization
- [ ] Add more courses and dynamic course management
- [ ] Generate student reports

---

## 👨‍💻 Author

**Abhinandan Basu**

- 🔗 GitHub: [@abhinandan998](https://github.com/abhinandan998)
- 💼 LinkedIn: [Abhinandan Basu](https://www.linkedin.com/in/abhinandan-basu/)
- 📦 Repository: [StudentManagementSystem](https://github.com/abhinandan998/StudentManagementSystem)

---


## 🤝 Contributing

Contributions, issues, and feature requests are welcome! Feel free to check the [issues page](https://github.com/abhinandan998/StudentManagementSystem/issues).

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

---

## ⭐ Show your support

Give a ⭐️ if this project helped you learn OOP concepts!

---

**Made with ❤️ by Abhinandan Basu**
