package vector;

public interface TemplateVector {

    // 复制数组区间的A[lo, hi)
    Integer[] copyFrom(Integer[] a, int lo, int hi);

    // 空间不足时扩容
    void expand();

    // 装填因子过小时压缩
    void shrink();

    // 扫描交换
    boolean bubble(int lo, int hi);

    // 起泡排序算法
    void bubbleSort(int lo, int hi);

    // 选取最大元素
    void max(int lo, int hi);

    // 选择排序算法
    void selectionSort(int lo, int hi);

    // 归并算法
    void merge(int lo, int mi, int hi);

    // 归并排序算法
    void mergeSort(int lo, int hi);

    // 轴点构造算法
    int partition(int lo, int hi);

    // 快速排序算法
    void quickSort(int lo, int hi);

    // 堆排序算法
    void heapSort(int lo, int hi);

    // todo 只读访问接口
    // 规模
    int size();

    // 数组的容量
    int capacity();

    // 判断是否为空
    boolean empty();

    // 判断向量是否已经排序
    int disordered();

    // 无序向量整体查找
    int find(int t);

    // 无序向量中间查找
    int find(int t, int lo, int hi);

    // 有序向量整体查找
    int search(int t);

    // 有序向量区间查找
    int search(int t, int lo, int hi);

    // 二分查找版本A
    int binSearchA(int t, int lo, int hi);

    // 二分查找版本B
    int binSearchB(int t, int lo, int hi);

    // 二分查找版本C
    int binSearchC(int t, int lo, int hi);

    // 插值查找
    int interpolationSearch(int t, int lo, int hi);

    // todo 可写访问接口
    // 删除秩为r的元素
    int remove(int position);

    // 删除秩在区间之内的元素
    int remove(int lo, int hi);

    /**
     * 插入元素
     * @param position 位置
     * @param t 元素
     * @return
     */
    int insert(int position, int t);

    // 默认作为末元素插入
    int insert(int t);

    // 对[lo, hi)排序
    void sort(int lo, int hi);

    // 对整体排序
    void sort();

    // 对[lo, hi)置乱
    void unsort(int lo, int hi);

    // 整体置乱
    void unsort();

    // 无序去重
    int deduplicate();

    // 有序去重
    int uniquify();

    // todo 遍历

}
