package io.swagger.api.impl;

import javax.jms.Connection;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import org.apache.activemq.ActiveMQConnectionFactory;

import com.google.gson.Gson;

import io.swagger.api.ApiResponseMessage;
import io.swagger.api.CadastroUsuarioApiService;
import io.swagger.api.NotFoundException;
import io.swagger.model.Usuario;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-01-19T23:35:34.275Z")
public class CadastroUsuarioApiServiceImpl extends CadastroUsuarioApiService {
	@Override
	public Response addUsuario(Usuario usuario, SecurityContext securityContext) throws NotFoundException {
		try {

			ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory("tcp://localhost:61616");

			//Create connection.
			Connection connection = factory.createConnection();
			
			// Start the connection
			connection.start();

			// Create a session which is non transactional
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

			// Create Destination queue
			Destination queue = session.createQueue("usuarios");

			// Create a producer
			MessageProducer producer = session.createProducer(queue);
			producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

			Gson gson = new Gson();
			String msg = gson.toJson(usuario);
			
			// insert message
			TextMessage message = session.createTextMessage(msg);
			System.out.println("Producer Sent: " + msg);
			producer.send(message);

			session.close();
			connection.close();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
	}
}
