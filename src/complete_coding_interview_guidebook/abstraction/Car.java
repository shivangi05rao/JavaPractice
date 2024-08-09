package complete_coding_interview_guidebook.abstraction;

public interface Car {
    public void speedUp();
    public void slowDown();
    public void turnRight();
    public void turnLeft();
    public String getCarType();
}

//Abstraction is one of the main OOP concepts that aim to make things as simple as possible.
//	It exposes the user only to the things that are relevant to them and hides the remaining details. So, abstraction allows the user to focus on what the application does instead of how it does it.
//	This way abstraction reduces the complexity of exposing things, increases the code re-usability, avoids code duplications and maintains the security and secrecy of applications by exposing only the important details.
//
//	For example,
//	A man driving a car, A man knows what the pedal does and what the steering wheel does, but he doesn't know how these things are done internally by the car. He doesn't know about the mechanism to empower these things.
//	This is what abstraction is, it is achieved by abstract classes and interfaces.
