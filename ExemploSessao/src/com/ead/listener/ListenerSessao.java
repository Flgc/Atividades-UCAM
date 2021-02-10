package com.ead.listener;

import java.io.FileWriter;
import java.util.Date;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class ListenerSessao
 *
 */
@WebListener
public class ListenerSessao implements HttpSessionAttributeListener {

	/**
	 * Default constructor.
	 */
	public ListenerSessao() {
		// TODO Auto-generated constructor stub
	}

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         try {
			FileWriter fw = new FileWriter("D:/TMP/log.txt", true);
			fw.write("Usuário armazenado na sessão : " + new Date().toString() + "\r\n");
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

	/**
	 * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
	 */
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
	 */
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
	}

}
