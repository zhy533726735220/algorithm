package list;

/**
 * 列表模板类
 */
public interface List<T> {


    /**
     * 选择排序
     */
    void selectionSort();

    /**
     * 插入排序
     */
    void insertSort();

    // 只读访问接口

    /**
     * 规模
     */
    int size();

    /**
     * 判断为空
     * @return
     */
    boolean empty();

    /**
     * 首节点位置
     * @return
     */
    Node<T> first();

    /**
     * 末节点位置
     * @return
     */
    Node<T> last();

    /**
     * 判断列表是否已经排序
     * @return
     */
    boolean disordered();

    /**
     * 无序列表查找
     * @param t
     * @return
     */
    Node<T> find(T t);

    /**
     *  有序列表查找
     * @param t
     * @return
     */
    Node<T> search(T t);

    /**
     * 在p及n-1个后继中选出最大者
     * @param p
     * @param n
     * @return
     */
    Node<T> selectMax(Node<T> p, int n);

    /**
     * 整体最大者
     * @return
     */
    Node<T> selectMax();

    // 可写访问接口

    /**
     * 将t当作首节点插入
     * @param t
     * @return
     */
    Node<T> insertAsFirst(T t);

    /**
     * 将t当作末节点插入
     * @param t
     * @return
     */
    Node<T> insertAsLast(T t);

    /**
     * 将t当作p的后继插入
     * @param p
     * @param t
     * @return
     */
    Node<T> insertA(Node<T> p, T t);

    /**
     * 将t当作p的前驱插入
     * @param p
     * @param t
     * @return
     */
    Node<T> insertB(Node<T> p, T t);

    /**
     * 删除合法位置p处的节点，返回被删除节点
     * @param p
     * @return
     */
    T remove(Node<T> p);

    /**
     * 列表区间排序
     * @param p
     * @param n
     */
    void sort(Node<T> p, int n);

    /**
     * 列表整体排序
     */
    void sort();

    /**
     * 无序去重
     * @return
     */
    int deduplicate();

    /**
     * 有序去重
     * @return
     */
    int uniquify();

    /**
     * 前后倒置
     */
    void reverse();
}

