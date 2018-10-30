package vector;

import vector.TemplateVector;

import java.util.Arrays;

public class Vector implements TemplateVector {
    // 规模
    int size = 0;
    // 容量
    int capacity = 2;
    Integer elem[] = new Integer[this.capacity];
    public Integer[] copyFrom(Integer[] a, int lo, int hi) {
        Integer[] copy = new Integer[2 * (hi -lo)];
        Integer size = 0;
        while (lo < hi) {
            copy[size++] = a[lo++];
        }
        return copy;
    }
    

    public void expand() {
//        System.err.println(this.size());
        if (this.size() < this.capacity()) {
            return;
        }
        this.elem = Arrays.copyOf(this.elem, this.elem.length * 2);
    }

    public Integer[] getElem() {
        return elem;
    }

    public void shrink() {

    }

    public boolean bubble(int lo, int hi) {
        return false;
    }

    public void bubbleSort(int lo, int hi) {
        for (int j = 0; j < hi - 1; j++) {
            for (int i = 0; i < hi; i++) {
                if (this.elem[i] > this.elem[i + 1]) {
                    swap(i, i + 1);
                }
            }
            hi--;
        }
    }

    private void swap(int a, int b) {
        int temp = this.elem[a];
        this.elem[a] = this.elem[b];
        this.elem[b] = temp;
    }

    public void max(int lo, int hi) {

    }

    public void selectionSort(int lo, int hi) {

    }

    public void merge(int lo, int mi, int hi) {

    }

    public void mergeSort(int lo, int hi) {

    }

    public int partition(int lo, int hi) {
        return 0;
    }

    public void quickSort(int lo, int hi) {

    }

    public void heapSort(int lo, int hi) {

    }

    public int size() {
        this.size = 0;
        for (int i = 0; i < this.elem.length; i++) {
            if (this.elem[i] != null) {
                this.size++;
            }
        }
        return this.size;
    }

    public int capacity() {
        return this.elem.length;
    }

    public boolean empty() {
        return false;
    }

    public int disordered() {
        // 计数器
        int n = 0;
        // 注意检查size - 1对相邻的元素
        for (int i = 0; i < this.size(); i++) {
            if (this.elem[i - 1] > this.elem[i]) {
                n++;
            }
        }
        return n;
    }

    public int find(int t) {
        return find(t, 0, this.size());
    }

    public int find(int t, int lo, int hi) {
        while ((lo < hi--)) {
            if (t == this.elem[hi]) {
                return hi;
            }
        }
        return -1;
    }

    public int search(int t) {
        return this.search(t, 0, this.size() -1);
    }

    public int search(int t, int lo, int hi) {
        return this.binSearchA(t, lo, hi);
    }

    /**
     * 有多个命中元素时，不能保证返回秩的最大者；查找失败时，简单的返回-1，而不能提示失败的位置
     * @param t
     * @param lo
     * @param hi
     * @return
     */
    @Override
    public int binSearchA(int t, int lo, int hi) {
        while (lo < hi) {
            int mi = (lo + hi) >> 1;
            if (t < this.elem[mi]) {
                hi = mi;
            } else if (this.elem[mi] < t) {
                lo = mi + 1;
            } else {
                return mi;
            }
        }
        return -1;
    }

    /**
     * 有多个命中元素时，不能保证返回秩的最大者；查找失败时，简单的返回-1，而不能提示失败的位置
     * @param t
     * @param lo
     * @param hi
     * @return
     */
    @Override
    public int binSearchB(int t, int lo, int hi) {
        // 每步迭代仅需做一次比较判断，有两个分支，成功查找不能提前终止
        while (1 < hi - lo) {
            // 以中心为轴点
            int mi = (lo + hi) >> 1;
            // 经过比较后确定深入[lo, mi)或[mi, hi)
            if (t < this.elem[mi]) {
                hi = mi;
            } else {
                lo = mi;
            }
            // 出口时hi = lo + 1, 查找区间仅含一个元素this.elem[lo];
        }
        return t ==  this.elem[lo] ? lo : -1;
    }

    /**
     * 有多个命中元素时，总能保证返回秩最大者；查找失败时，能够返回失败的位置
     * @param t
     * @param lo
     * @param hi
     * @return
     */
    @Override
    public int binSearchC(int t, int lo, int hi) {
        // 每步迭代仅需做一次比较判断，有两个分支
        while (lo < hi) {
            // 以轴点为中心
            int mi = (lo + hi) >> 1;
            // 经比较后确定深入[lo, mi)或(mi, hi]
            if ((t < this.elem[mi])) {
                hi = mi;
            } else {
                lo = mi + 1;
            }
        }
        // 循环结束时，lo为大于t的元素的最小秩，故lo - 1即不大于e的元素的最大秩
        return --lo;
    }

    /**
     * 例子：查找字典，找z的字，一定会翻后面的
     * 插值查找的假设：数据是有序均匀分布的
     * (mi - lo) / (hi - lo) = (key - a[lo]) / (a[hi] - a[lo])
     * mid = lo + (hi - lo) * (key - a[lo]) / (a[hi] - a[lo])
     * @param t
     * @param lo
     * @param hi
     * @return
     */
    @Override
    public int interpolationSearch(int t, int lo, int hi) {
        while (lo < hi) {
            int mi = lo + (hi - lo) * (t - this.elem[lo]) / (this.elem[hi] - this.elem[lo]);
            if (t < this.elem[mi]) {
                hi = mi - 1;
            } else if (t > this.elem[mi]) {
                lo = mi + 1;
            } else {
                return mi;
            }
        }
        return -1;
    }

    public int remove(int position) {
        System.arraycopy(this.elem, position + 1, this.elem, position, this.size() - position);
        return position;
    }

    public int remove(int lo, int hi) {
        for (int i = 0; i < hi - lo; i++) {
            this.remove(lo);
        }
        return hi - lo;
    }

    public int insert(int position, int t) {
        this.expand();
        for (int i = this.size(); i > position; i--) {
            this.elem[i] = this.elem[i - 1];
        }
        this.elem[position] = t;
        return position;
    }

    public int insert(int t) {
        this.expand();
        this.elem[this.size()] = t;
        return this.size();
    }

    public void sort(int lo, int hi) {

    }

    public void sort() {

    }

    public void unsort(int lo, int hi) {

    }

    public void unsort() {

    }

    public int deduplicate() {
        // 低效版
//        int i = 0;
//        int oldSize = this.size();
//        while (i < this.size()) {
//            if ((this.find(this.elem[i], i + 1, this.size()) != -1)) {
//                this.remove(i);
//            } else {
//                i++;
//            }
//        }
//        return oldSize - this.size();
        // 高效版
        // 各对互异"相邻"元素的位置
        int i = 0;
        int j = 0;
        int oldSize = this.size();
        while (++j < this.size()) {
            // 跳过雷同者
            if (this.elem[i] != this.elem[j]) {
                // 发现不同元素时，向前移至紧邻于前者右侧
                this.elem[++i] = this.elem[j];
            }
        }
        this.remove(i + 1, this.size());
        // 被删除的元素的数量
        return oldSize - this.size();

    }

    public int uniquify() {
        int i = 1;
        int oldSize = this.size();
        while (1 < this.size()) {
            if (this.elem[i - 1] == this.elem[i]) {
                this.remove(i);
            } else {
                i++;
            }
        }
        return oldSize - this.size();
    }
}
