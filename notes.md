# Kotlin Access Modifiers – Learning Notes

## Public (default)
- All classes and functions are public by default
- No need to explicitly write `public`
- Class-level: accessible everywhere
- File-level: accessible everywhere

## Private Access Modifier

### Kotlin
- Private members visible only inside class
- Top-level private is file-scoped

### Java
- Private members visible only inside class
- No file-level private

### Key Difference
- Kotlin supports file-level encapsulation
- Java relies on packages

## Protected Access Modifier

### Kotlin
- Classes are final by default
- `open` keyword required for inheritance
- `protected` members accessible only in subclasses
- No package-based access

### Java
- Classes are inheritable by default
- `protected` allows access in same package
- Subclasses can access protected members

### Key Difference
- Kotlin enforces stricter encapsulation
- Java allows wider access via packages

## Internal Access Modifier (Kotlin-only)

### Kotlin
- Visible only within the same module
- Stronger boundary than packages
- Ideal for service and repository layers

### Java
- No module-level visibility (pre-JPMS)
- Closest equivalent is package-private
- Package access is weaker and error-prone

### Key Difference
- Kotlin enforces architectural boundaries
- Java relies on conventions

## Top-Level Functions

### Kotlin
- Functions can exist outside classes
- Access modifiers apply at file level
- Enables clean utility and helper functions

### Java
- Functions must belong to a class
- Utility classes rely on static methods
- No file-level encapsulation

### Key Advantage
- Kotlin reduces boilerplate
- Stronger encapsulation with simpler design

## Key Difference from Java
- Kotlin does NOT have package-private