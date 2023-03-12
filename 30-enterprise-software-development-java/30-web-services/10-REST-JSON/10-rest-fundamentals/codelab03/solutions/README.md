# Writing your own REST url's

This is an exercise without coding 😲.

We'll describe an endpoint for an application you provide the correct HTTP method and URL. If necessary provide an
example body. The first two solutions we provide ourselves.

The domain (and the start of all our endpoints) of our application is https://digibooky.com

---
## Basic operations

### Endpoint

Providing a list of all the Books in the system

### Solution

    GET https://digibooky.com/books

---

### Endpoint

Adding a new book to the system

### Solution

    POST https://digibooky.com/books
    
    {"title":"Lord of the Rings", "author":"J.R.R."}

---

### Endpoint

Getting one specific book from the system

### Solution

    GET https://digibooky/books/1

---

### Endpoint

Deleting one specific book from the system

### Solution

    DELETE https://digibooky/books/1

---

### Endpoint

Updating one book with new information

### Solution

    PUT https://digibooky/books/1

    {"title":"Lord of the Rings", "author":"J.R.R."}
---

### Endpoint

Getting all the books in the system that have 'the' in their title

### Solution

    GET https://digibooky/books?title=the

---

### Endpoint

Getting all the books in the system that have 'the' in their title and have an author with 'a' in their name.

### Solution

    GET https://digibooky/books?title=the&author=a

---

### Endpoint

Reserving a specific book

### Solution

    POST https://digibooky/books/1/reserve

---

### Endpoint

Getting the list of authors from a specific book

### Solution

    GET https://digibooky/books/1/authors

---

### Endpoint

Getting the list of all lenders from a specific book with lending date before 2020-12-24

### Solution

    GET https://digibooky/books/1/lenders?lendingDateBefore=2020-12-24

---

### Endpoint

Adding a new author to a specific book

### Solution

    POST https://digibooky/books/1/authors
