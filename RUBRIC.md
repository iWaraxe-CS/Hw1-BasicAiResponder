# Week 1 Homework: Grading Rubric

## 📊 Overall Scoring Distribution

| Category | Weight | Points | Description |
|----------|--------|--------|-------------|
| **Correctness** | 70% | 70 pts | Core functionality working as specified |
| **Efficiency** | 30% | 30 pts | Resource usage and code quality |
| **Total** | 100% | **100 pts** | Maximum possible score |

---

## 🎯 Correctness Criteria (70 points)

### Core Functionality (40 points)

#### ✅ API Endpoint Implementation (20 points)
- **Excellent (18-20 pts)**: 
  - `POST /generate` endpoint correctly implemented
  - Accepts JSON payload with prompt field
  - Returns proper JSON response format
  - Uses appropriate HTTP status codes (200, 400, 500)
- **Good (14-17 pts)**: 
  - Endpoint works but minor issues with request/response format
  - HTTP status codes mostly correct
- **Satisfactory (10-13 pts)**: 
  - Basic endpoint functionality present
  - Some issues with JSON handling or status codes
- **Needs Improvement (0-9 pts)**: 
  - Endpoint doesn't work properly or missing key functionality

#### ✅ OpenAI Integration (20 points)
- **Excellent (18-20 pts)**:
  - Uses Spring AI ChatClient correctly
  - Successful API calls to OpenAI
  - Proper handling of API responses
  - Configurable model parameters (model, temperature, max tokens)
- **Good (14-17 pts)**:
  - OpenAI integration works with minor configuration issues
  - Some parameters may be hardcoded
- **Satisfactory (10-13 pts)**:
  - Basic API calls work but poor configuration management
- **Needs Improvement (0-9 pts)**:
  - OpenAI integration fails or not implemented

### Error Handling (20 points)

#### ✅ Input Validation (10 points)
- **Excellent (9-10 pts)**:
  - Validates prompt is not null or empty
  - Handles malformed JSON requests
  - Returns meaningful error messages
- **Good (7-8 pts)**:
  - Basic validation present with minor gaps
- **Satisfactory (5-6 pts)**:
  - Some validation but inconsistent
- **Needs Improvement (0-4 pts)**:
  - No input validation or validation fails

#### ✅ API Failure Handling (10 points)
- **Excellent (9-10 pts)**:
  - Gracefully handles OpenAI API failures
  - Proper handling of invalid API keys
  - Appropriate error responses with correct HTTP status codes
  - Handles network timeouts and connection issues
- **Good (7-8 pts)**:
  - Handles most error scenarios adequately
- **Satisfactory (5-6 pts)**:
  - Basic error handling present
- **Needs Improvement (0-4 pts)**:
  - Poor or missing error handling

### Response Quality (10 points)

#### ✅ Response Format (5 points)
- **Excellent (5 pts)**: Consistent JSON response format with required fields
- **Good (4 pts)**: Mostly correct format with minor inconsistencies
- **Satisfactory (2-3 pts)**: Basic response format
- **Needs Improvement (0-1 pts)**: Incorrect or missing response format

#### ✅ Content Relevance (5 points)
- **Excellent (5 pts)**: AI responses are relevant and appropriate to prompts
- **Good (4 pts)**: Generally relevant responses
- **Satisfactory (2-3 pts)**: Responses somewhat related to prompts
- **Needs Improvement (0-1 pts)**: Irrelevant or inappropriate responses

---

## ⚡ Efficiency Criteria (30 points)

### Resource Usage (15 points)

#### ✅ API Call Optimization (8 points)
- **Excellent (7-8 pts)**:
  - No redundant OpenAI API calls
  - Single API call per request
  - No unnecessary loops or repeated requests
- **Good (6 pts)**:
  - Generally efficient with minor redundancies
- **Satisfactory (4-5 pts)**:
  - Some inefficient patterns but working
- **Needs Improvement (0-3 pts)**:
  - Multiple unnecessary API calls or poor optimization

#### ✅ Memory Management (7 points)
- **Excellent (6-7 pts)**:
  - Handles large prompts appropriately (validation, truncation, or rejection)
  - No memory leaks or excessive memory usage
  - Proper resource cleanup
- **Good (5 pts)**:
  - Generally good memory usage
- **Satisfactory (3-4 pts)**:
  - Basic memory management
- **Needs Improvement (0-2 pts)**:
  - Poor memory usage or potential memory issues

### Code Quality (15 points)

#### ✅ Spring Framework Usage (8 points)
- **Excellent (7-8 pts)**:
  - Proper use of Spring Boot annotations
  - Clean dependency injection with @RequiredArgsConstructor
  - Service layer properly implemented
  - Configuration externalized appropriately
- **Good (6 pts)**:
  - Good Spring usage with minor issues
- **Satisfactory (4-5 pts)**:
  - Basic Spring patterns used
- **Needs Improvement (0-3 pts)**:
  - Poor or incorrect Spring framework usage

#### ✅ Architecture & Design (7 points)
- **Excellent (6-7 pts)**:
  - Clean separation of concerns (Controller → Service → Repository pattern)
  - Proper use of DTOs for request/response
  - Well-organized package structure
  - Follows SOLID principles
- **Good (5 pts)**:
  - Generally good architecture
- **Satisfactory (3-4 pts)**:
  - Basic architectural patterns
- **Needs Improvement (0-2 pts)**:
  - Poor architecture or design patterns

---

## 🔍 Evaluation Guidelines

### Automatic Deductions
- **Security Issues**: -10 pts for hardcoded API keys or security vulnerabilities
- **Non-functional Application**: -20 pts if application fails to start
- **Missing Core Requirements**: -15 pts per missing major requirement

### Bonus Considerations (up to +5 pts)
- Exceptional error handling with detailed error messages
- Additional input validation beyond requirements
- Comprehensive logging implementation
- Creative but appropriate enhancements

### Common Mistakes & Penalties

| Mistake | Penalty | Description |
|---------|---------|-------------|
| Hardcoded API Key | -10 pts | API key in source code instead of environment variable |
| No Input Validation | -10 pts | Missing prompt validation |
| Poor Error Messages | -5 pts | Generic or unhelpful error responses |
| Wrong HTTP Status Codes | -5 pts | Using 200 for errors or inappropriate codes |
| Logging Sensitive Data | -5 pts | Logging API keys or sensitive information |
| Multiple API Calls per Request | -8 pts | Inefficient OpenAI API usage |
| Application Won't Start | -20 pts | Configuration or dependency issues |

---

## 📋 Grading Checklist

### Before Grading
- [ ] Verify student has set OPENAI_API_KEY environment variable
- [ ] Confirm application starts successfully
- [ ] Check that basic endpoint responds

### During Grading
- [ ] Test successful prompt processing
- [ ] Test error scenarios (empty prompt, API failure simulation)
- [ ] Verify response format consistency
- [ ] Check logging output (no sensitive data)
- [ ] Review code for Spring best practices
- [ ] Assess error handling completeness

### Grade Calculation
```
Final Score = (Correctness Points / 70) × 70 + (Efficiency Points / 30) × 30
Letter Grade:
- A: 90-100 pts
- B: 80-89 pts  
- C: 70-79 pts
- D: 60-69 pts
- F: <60 pts
```

---

## 📝 Feedback Template

**Strengths:**
- [List what the student did well]

**Areas for Improvement:**
- [Specific feedback on what needs work]

**Grade Breakdown:**
- Correctness: ___/70
- Efficiency: ___/30
- **Total: ___/100**

**Additional Comments:**
[Detailed feedback and suggestions for improvement]