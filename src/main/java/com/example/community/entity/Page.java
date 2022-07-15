package com.example.community.entity;

/**
 * 封装分页相关的信息.
 */
public class Page {

    // 当前页码
    private int current = 1;
    // 显示上限
    private int limit = 10;
    // 数据总数(用于计算总页数)
    private int rows;
    // 查询路径(用于复用分页链接)
    private String path;

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        if (current >= 1) {
            this.current = current;
        }
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        if (limit >= 1 && limit <= 100) {
            this.limit = limit;
        }
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if (rows >= 0) {
            this.rows = rows;
        }
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取当前页的起始行
     *
     * @return
     */
    public int getOffset() {
        // current * limit - limit
        return (current - 1) * limit;
    }

    /**
     * 获取总页数
     *
     * @return
     */
    public int getTotal() {
        // rows / limit [+1]
        if (rows % limit == 0) {
            return rows / limit;
        } else {
            return rows / limit + 1;
        }
    }

    /**
     * 为了显示该页码的前两个页码  12 3 45 为了显示12
     * 获取起始页码
     *
     *
     * @return
     */
    public int getFrom() {
        int from = current - 2;
        //小于第一页就只能到第一页
        return from < 1 ? 1 : from;
    }

    /**
     *
     * 为了显示45   12 3 45  当前页为3
     * 获取结束页码
     *
     * @return
     */
    public int getTo() {
        int to = current + 2;
        //获取总的页码数
        int total = getTotal();
        return to > total ? total : to;
    }

}
