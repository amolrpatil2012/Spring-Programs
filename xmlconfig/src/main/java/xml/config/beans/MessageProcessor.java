package xml.config.beans;

public class MessageProcessor {

		MessageService service;

		public MessageService getService() {
			return service;
		}

		public void setService(MessageService service) {
			this.service = service;
		}

		public MessageProcessor(MessageService service) {
			super();
			this.service = service;
		}

		@Override
		public String toString() {
			return "MessageProcessor [service=" + service + "]";
		}
		
		public MessageProcessor() {}
}
