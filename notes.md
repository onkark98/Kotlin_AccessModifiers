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

## Key Difference from Java
- Kotlin does NOT have package-private