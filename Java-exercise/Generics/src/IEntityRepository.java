public interface IEntityRepository<T extends IEntity> {
    public void add(T entity);
    public void delete(T entity);
    public void update(T entity);
    // Olusuturulan metodlarin parametreleri generic kisitlar ile type safe hale getirilebilir
}
