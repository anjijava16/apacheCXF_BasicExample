package contactus;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "contactus.ContactUsService")
public final class ContactUsServiceImpl implements ContactUsService {

    @Override
    public List<Message> getMessages() {
        List<Message> messages = new ArrayList<Message>();
        messages.add(new Message(
                "Willie", "Wheeler", "willie.wheeler@xyz.com", "Great job"));
        messages.add(new Message(
                "Dardy", "Chen", "dardy.chen@xyz.com", "I want my money back"));
        return messages;
    }

    @Override
    public void postMessage(Message message) {
        System.out.println(message);
    }
}