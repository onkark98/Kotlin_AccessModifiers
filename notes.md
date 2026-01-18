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

## Key Difference from Java
- Kotlin does NOT have package-private