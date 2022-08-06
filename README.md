# Use-draganddropby-in-any-HTML-Page
Assignment 3 W9D5 - SDA - Software QA Bootcamp

## Table of contents
* [Question](#question)
* [Answer](#answer)
* [Output Screenshots](#output-screenshots)

---
## Question
Create an Automation Scripts using selenium to ‘drag and drop by’ in any web page.

Use any website with drag and drop option.

- STEP 1: Evoke the browser
- STEP 2: Navigate to the website
- STEP 3: Find the web elements to drag and drop
- STEP 4: Drag and Drop (Using the draganddropby method; we drop a web element on a particular webpage, offset location)

## Answer
I used a ["draw.io"](https://app.diagrams.net/) website

### First:
Setup Latest Web Driver for Chrome  Driver.
Donwload the necessary jar files:
- Selenium (Lastest).
- TestNG (Lastest).
- commander (Lastest).

### Second:
Add them as a library in the classpath of the project
- _click-reight on the file project >Build path > configure Bild path > Java Build Path > Libraries > classpath > add external JARs > Apply and close_.

### Third:
I opened the website, then take web elements, and then add them to the code.

I used `Actions` class and `dragAndDropBy` method

```md
Actions a = new Actions(driver);
a.dragAndDropBy(source, xoffset , yoffset).build().perform();
```

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/183253276-9dcde69c-4b86-4454-b847-0fdfbe34d52f.png" width=60% height=60%>
</p>


---
## Output Screenshots:

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/183253300-d218fc1d-db0d-46d2-a184-643cb5858cfe.png" width=80% height=80%>



https://user-images.githubusercontent.com/48597284/183253405-6f6eb4e8-22db-4815-81e4-9835a2e4b355.mp4



</p>
