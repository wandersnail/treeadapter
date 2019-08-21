package cn.wandersnail.adapter.tree;

import android.view.View;
import android.widget.AdapterView;

/**
 * 不可展开的条目长按事件监听
 * <p>
 * date: 2019/8/21 22:10
 * author: zengfansheng
 */
public interface OnInnerItemLongClickListener<T extends Node<T>> {
    /**
     * @param node     被长按条目的数据
     * @param parent   被长按的父容器
     * @param view     被长按的View
     * @param position 被长按条目所在整个数据集合中的索引
     */
    void onLongClick(T node, AdapterView<?> parent, View view, int position);
}
