package hello.proxy.app.v1;

public class OrderItemServiceV1Impl implements OrderServiceV1{
	private final OrderRepositoryV1 orderRepository;

	public OrderItemServiceV1Impl(OrderRepositoryV1 orderRepository) {
		this.orderRepository = orderRepository;
	}

	@Override
	public void orderItem(String itemId) {
		orderRepository.save(itemId);
	}
}
