package schedule.service;

public interface Kafka {

	public boolean send(String topic, String jsonString);

}
