package yycg.base.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class UsergysExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsergysExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMcIsNull() {
            addCriterion("mc is null");
            return (Criteria) this;
        }

        public Criteria andMcIsNotNull() {
            addCriterion("mc is not null");
            return (Criteria) this;
        }

        public Criteria andMcEqualTo(String value) {
            addCriterion("mc =", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotEqualTo(String value) {
            addCriterion("mc <>", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThan(String value) {
            addCriterion("mc >", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThanOrEqualTo(String value) {
            addCriterion("mc >=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThan(String value) {
            addCriterion("mc <", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThanOrEqualTo(String value) {
            addCriterion("mc <=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLike(String value) {
            addCriterion("mc like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotLike(String value) {
            addCriterion("mc not like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcIn(List<String> values) {
            addCriterion("mc in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotIn(List<String> values) {
            addCriterion("mc not in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcBetween(String value1, String value2) {
            addCriterion("mc between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotBetween(String value1, String value2) {
            addCriterion("mc not between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andLbIsNull() {
            addCriterion("lb is null");
            return (Criteria) this;
        }

        public Criteria andLbIsNotNull() {
            addCriterion("lb is not null");
            return (Criteria) this;
        }

        public Criteria andLbEqualTo(String value) {
            addCriterion("lb =", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotEqualTo(String value) {
            addCriterion("lb <>", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbGreaterThan(String value) {
            addCriterion("lb >", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbGreaterThanOrEqualTo(String value) {
            addCriterion("lb >=", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbLessThan(String value) {
            addCriterion("lb <", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbLessThanOrEqualTo(String value) {
            addCriterion("lb <=", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbLike(String value) {
            addCriterion("lb like", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotLike(String value) {
            addCriterion("lb not like", value, "lb");
            return (Criteria) this;
        }

        public Criteria andLbIn(List<String> values) {
            addCriterion("lb in", values, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotIn(List<String> values) {
            addCriterion("lb not in", values, "lb");
            return (Criteria) this;
        }

        public Criteria andLbBetween(String value1, String value2) {
            addCriterion("lb between", value1, value2, "lb");
            return (Criteria) this;
        }

        public Criteria andLbNotBetween(String value1, String value2) {
            addCriterion("lb not between", value1, value2, "lb");
            return (Criteria) this;
        }

        public Criteria andXkzIsNull() {
            addCriterion("xkz is null");
            return (Criteria) this;
        }

        public Criteria andXkzIsNotNull() {
            addCriterion("xkz is not null");
            return (Criteria) this;
        }

        public Criteria andXkzEqualTo(String value) {
            addCriterion("xkz =", value, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzNotEqualTo(String value) {
            addCriterion("xkz <>", value, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzGreaterThan(String value) {
            addCriterion("xkz >", value, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzGreaterThanOrEqualTo(String value) {
            addCriterion("xkz >=", value, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzLessThan(String value) {
            addCriterion("xkz <", value, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzLessThanOrEqualTo(String value) {
            addCriterion("xkz <=", value, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzLike(String value) {
            addCriterion("xkz like", value, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzNotLike(String value) {
            addCriterion("xkz not like", value, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzIn(List<String> values) {
            addCriterion("xkz in", values, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzNotIn(List<String> values) {
            addCriterion("xkz not in", values, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzBetween(String value1, String value2) {
            addCriterion("xkz between", value1, value2, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzNotBetween(String value1, String value2) {
            addCriterion("xkz not between", value1, value2, "xkz");
            return (Criteria) this;
        }

        public Criteria andXkzyxqIsNull() {
            addCriterion("xkzyxq is null");
            return (Criteria) this;
        }

        public Criteria andXkzyxqIsNotNull() {
            addCriterion("xkzyxq is not null");
            return (Criteria) this;
        }

        public Criteria andXkzyxqEqualTo(String value) {
            addCriterion("xkzyxq =", value, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqNotEqualTo(String value) {
            addCriterion("xkzyxq <>", value, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqGreaterThan(String value) {
            addCriterion("xkzyxq >", value, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqGreaterThanOrEqualTo(String value) {
            addCriterion("xkzyxq >=", value, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqLessThan(String value) {
            addCriterion("xkzyxq <", value, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqLessThanOrEqualTo(String value) {
            addCriterion("xkzyxq <=", value, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqLike(String value) {
            addCriterion("xkzyxq like", value, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqNotLike(String value) {
            addCriterion("xkzyxq not like", value, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqIn(List<String> values) {
            addCriterion("xkzyxq in", values, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqNotIn(List<String> values) {
            addCriterion("xkzyxq not in", values, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqBetween(String value1, String value2) {
            addCriterion("xkzyxq between", value1, value2, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andXkzyxqNotBetween(String value1, String value2) {
            addCriterion("xkzyxq not between", value1, value2, "xkzyxq");
            return (Criteria) this;
        }

        public Criteria andLxrIsNull() {
            addCriterion("lxr is null");
            return (Criteria) this;
        }

        public Criteria andLxrIsNotNull() {
            addCriterion("lxr is not null");
            return (Criteria) this;
        }

        public Criteria andLxrEqualTo(String value) {
            addCriterion("lxr =", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotEqualTo(String value) {
            addCriterion("lxr <>", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrGreaterThan(String value) {
            addCriterion("lxr >", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrGreaterThanOrEqualTo(String value) {
            addCriterion("lxr >=", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLessThan(String value) {
            addCriterion("lxr <", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLessThanOrEqualTo(String value) {
            addCriterion("lxr <=", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrLike(String value) {
            addCriterion("lxr like", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotLike(String value) {
            addCriterion("lxr not like", value, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrIn(List<String> values) {
            addCriterion("lxr in", values, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotIn(List<String> values) {
            addCriterion("lxr not in", values, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrBetween(String value1, String value2) {
            addCriterion("lxr between", value1, value2, "lxr");
            return (Criteria) this;
        }

        public Criteria andLxrNotBetween(String value1, String value2) {
            addCriterion("lxr not between", value1, value2, "lxr");
            return (Criteria) this;
        }

        public Criteria andDhIsNull() {
            addCriterion("dh is null");
            return (Criteria) this;
        }

        public Criteria andDhIsNotNull() {
            addCriterion("dh is not null");
            return (Criteria) this;
        }

        public Criteria andDhEqualTo(String value) {
            addCriterion("dh =", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotEqualTo(String value) {
            addCriterion("dh <>", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThan(String value) {
            addCriterion("dh >", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThanOrEqualTo(String value) {
            addCriterion("dh >=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThan(String value) {
            addCriterion("dh <", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThanOrEqualTo(String value) {
            addCriterion("dh <=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLike(String value) {
            addCriterion("dh like", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotLike(String value) {
            addCriterion("dh not like", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhIn(List<String> values) {
            addCriterion("dh in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotIn(List<String> values) {
            addCriterion("dh not in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhBetween(String value1, String value2) {
            addCriterion("dh between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotBetween(String value1, String value2) {
            addCriterion("dh not between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andJyfwIsNull() {
            addCriterion("jyfw is null");
            return (Criteria) this;
        }

        public Criteria andJyfwIsNotNull() {
            addCriterion("jyfw is not null");
            return (Criteria) this;
        }

        public Criteria andJyfwEqualTo(String value) {
            addCriterion("jyfw =", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotEqualTo(String value) {
            addCriterion("jyfw <>", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwGreaterThan(String value) {
            addCriterion("jyfw >", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwGreaterThanOrEqualTo(String value) {
            addCriterion("jyfw >=", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwLessThan(String value) {
            addCriterion("jyfw <", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwLessThanOrEqualTo(String value) {
            addCriterion("jyfw <=", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwLike(String value) {
            addCriterion("jyfw like", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotLike(String value) {
            addCriterion("jyfw not like", value, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwIn(List<String> values) {
            addCriterion("jyfw in", values, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotIn(List<String> values) {
            addCriterion("jyfw not in", values, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwBetween(String value1, String value2) {
            addCriterion("jyfw between", value1, value2, "jyfw");
            return (Criteria) this;
        }

        public Criteria andJyfwNotBetween(String value1, String value2) {
            addCriterion("jyfw not between", value1, value2, "jyfw");
            return (Criteria) this;
        }

        public Criteria andZcdzIsNull() {
            addCriterion("zcdz is null");
            return (Criteria) this;
        }

        public Criteria andZcdzIsNotNull() {
            addCriterion("zcdz is not null");
            return (Criteria) this;
        }

        public Criteria andZcdzEqualTo(String value) {
            addCriterion("zcdz =", value, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzNotEqualTo(String value) {
            addCriterion("zcdz <>", value, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzGreaterThan(String value) {
            addCriterion("zcdz >", value, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzGreaterThanOrEqualTo(String value) {
            addCriterion("zcdz >=", value, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzLessThan(String value) {
            addCriterion("zcdz <", value, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzLessThanOrEqualTo(String value) {
            addCriterion("zcdz <=", value, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzLike(String value) {
            addCriterion("zcdz like", value, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzNotLike(String value) {
            addCriterion("zcdz not like", value, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzIn(List<String> values) {
            addCriterion("zcdz in", values, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzNotIn(List<String> values) {
            addCriterion("zcdz not in", values, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzBetween(String value1, String value2) {
            addCriterion("zcdz between", value1, value2, "zcdz");
            return (Criteria) this;
        }

        public Criteria andZcdzNotBetween(String value1, String value2) {
            addCriterion("zcdz not between", value1, value2, "zcdz");
            return (Criteria) this;
        }

        public Criteria andLxdzIsNull() {
            addCriterion("lxdz is null");
            return (Criteria) this;
        }

        public Criteria andLxdzIsNotNull() {
            addCriterion("lxdz is not null");
            return (Criteria) this;
        }

        public Criteria andLxdzEqualTo(String value) {
            addCriterion("lxdz =", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotEqualTo(String value) {
            addCriterion("lxdz <>", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzGreaterThan(String value) {
            addCriterion("lxdz >", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzGreaterThanOrEqualTo(String value) {
            addCriterion("lxdz >=", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzLessThan(String value) {
            addCriterion("lxdz <", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzLessThanOrEqualTo(String value) {
            addCriterion("lxdz <=", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzLike(String value) {
            addCriterion("lxdz like", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotLike(String value) {
            addCriterion("lxdz not like", value, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzIn(List<String> values) {
            addCriterion("lxdz in", values, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotIn(List<String> values) {
            addCriterion("lxdz not in", values, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzBetween(String value1, String value2) {
            addCriterion("lxdz between", value1, value2, "lxdz");
            return (Criteria) this;
        }

        public Criteria andLxdzNotBetween(String value1, String value2) {
            addCriterion("lxdz not between", value1, value2, "lxdz");
            return (Criteria) this;
        }

        public Criteria andYzbmIsNull() {
            addCriterion("yzbm is null");
            return (Criteria) this;
        }

        public Criteria andYzbmIsNotNull() {
            addCriterion("yzbm is not null");
            return (Criteria) this;
        }

        public Criteria andYzbmEqualTo(String value) {
            addCriterion("yzbm =", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotEqualTo(String value) {
            addCriterion("yzbm <>", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmGreaterThan(String value) {
            addCriterion("yzbm >", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmGreaterThanOrEqualTo(String value) {
            addCriterion("yzbm >=", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLessThan(String value) {
            addCriterion("yzbm <", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLessThanOrEqualTo(String value) {
            addCriterion("yzbm <=", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmLike(String value) {
            addCriterion("yzbm like", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotLike(String value) {
            addCriterion("yzbm not like", value, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmIn(List<String> values) {
            addCriterion("yzbm in", values, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotIn(List<String> values) {
            addCriterion("yzbm not in", values, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmBetween(String value1, String value2) {
            addCriterion("yzbm between", value1, value2, "yzbm");
            return (Criteria) this;
        }

        public Criteria andYzbmNotBetween(String value1, String value2) {
            addCriterion("yzbm not between", value1, value2, "yzbm");
            return (Criteria) this;
        }

        public Criteria andZzcIsNull() {
            addCriterion("zzc is null");
            return (Criteria) this;
        }

        public Criteria andZzcIsNotNull() {
            addCriterion("zzc is not null");
            return (Criteria) this;
        }

        public Criteria andZzcEqualTo(String value) {
            addCriterion("zzc =", value, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcNotEqualTo(String value) {
            addCriterion("zzc <>", value, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcGreaterThan(String value) {
            addCriterion("zzc >", value, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcGreaterThanOrEqualTo(String value) {
            addCriterion("zzc >=", value, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcLessThan(String value) {
            addCriterion("zzc <", value, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcLessThanOrEqualTo(String value) {
            addCriterion("zzc <=", value, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcLike(String value) {
            addCriterion("zzc like", value, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcNotLike(String value) {
            addCriterion("zzc not like", value, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcIn(List<String> values) {
            addCriterion("zzc in", values, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcNotIn(List<String> values) {
            addCriterion("zzc not in", values, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcBetween(String value1, String value2) {
            addCriterion("zzc between", value1, value2, "zzc");
            return (Criteria) this;
        }

        public Criteria andZzcNotBetween(String value1, String value2) {
            addCriterion("zzc not between", value1, value2, "zzc");
            return (Criteria) this;
        }

        public Criteria andCzIsNull() {
            addCriterion("cz is null");
            return (Criteria) this;
        }

        public Criteria andCzIsNotNull() {
            addCriterion("cz is not null");
            return (Criteria) this;
        }

        public Criteria andCzEqualTo(String value) {
            addCriterion("cz =", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotEqualTo(String value) {
            addCriterion("cz <>", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzGreaterThan(String value) {
            addCriterion("cz >", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzGreaterThanOrEqualTo(String value) {
            addCriterion("cz >=", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLessThan(String value) {
            addCriterion("cz <", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLessThanOrEqualTo(String value) {
            addCriterion("cz <=", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzLike(String value) {
            addCriterion("cz like", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotLike(String value) {
            addCriterion("cz not like", value, "cz");
            return (Criteria) this;
        }

        public Criteria andCzIn(List<String> values) {
            addCriterion("cz in", values, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotIn(List<String> values) {
            addCriterion("cz not in", values, "cz");
            return (Criteria) this;
        }

        public Criteria andCzBetween(String value1, String value2) {
            addCriterion("cz between", value1, value2, "cz");
            return (Criteria) this;
        }

        public Criteria andCzNotBetween(String value1, String value2) {
            addCriterion("cz not between", value1, value2, "cz");
            return (Criteria) this;
        }

        public Criteria andFrmcIsNull() {
            addCriterion("frmc is null");
            return (Criteria) this;
        }

        public Criteria andFrmcIsNotNull() {
            addCriterion("frmc is not null");
            return (Criteria) this;
        }

        public Criteria andFrmcEqualTo(String value) {
            addCriterion("frmc =", value, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcNotEqualTo(String value) {
            addCriterion("frmc <>", value, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcGreaterThan(String value) {
            addCriterion("frmc >", value, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcGreaterThanOrEqualTo(String value) {
            addCriterion("frmc >=", value, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcLessThan(String value) {
            addCriterion("frmc <", value, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcLessThanOrEqualTo(String value) {
            addCriterion("frmc <=", value, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcLike(String value) {
            addCriterion("frmc like", value, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcNotLike(String value) {
            addCriterion("frmc not like", value, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcIn(List<String> values) {
            addCriterion("frmc in", values, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcNotIn(List<String> values) {
            addCriterion("frmc not in", values, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcBetween(String value1, String value2) {
            addCriterion("frmc between", value1, value2, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrmcNotBetween(String value1, String value2) {
            addCriterion("frmc not between", value1, value2, "frmc");
            return (Criteria) this;
        }

        public Criteria andFrsfzIsNull() {
            addCriterion("frsfz is null");
            return (Criteria) this;
        }

        public Criteria andFrsfzIsNotNull() {
            addCriterion("frsfz is not null");
            return (Criteria) this;
        }

        public Criteria andFrsfzEqualTo(String value) {
            addCriterion("frsfz =", value, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzNotEqualTo(String value) {
            addCriterion("frsfz <>", value, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzGreaterThan(String value) {
            addCriterion("frsfz >", value, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzGreaterThanOrEqualTo(String value) {
            addCriterion("frsfz >=", value, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzLessThan(String value) {
            addCriterion("frsfz <", value, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzLessThanOrEqualTo(String value) {
            addCriterion("frsfz <=", value, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzLike(String value) {
            addCriterion("frsfz like", value, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzNotLike(String value) {
            addCriterion("frsfz not like", value, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzIn(List<String> values) {
            addCriterion("frsfz in", values, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzNotIn(List<String> values) {
            addCriterion("frsfz not in", values, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzBetween(String value1, String value2) {
            addCriterion("frsfz between", value1, value2, "frsfz");
            return (Criteria) this;
        }

        public Criteria andFrsfzNotBetween(String value1, String value2) {
            addCriterion("frsfz not between", value1, value2, "frsfz");
            return (Criteria) this;
        }

        public Criteria andZczjIsNull() {
            addCriterion("zczj is null");
            return (Criteria) this;
        }

        public Criteria andZczjIsNotNull() {
            addCriterion("zczj is not null");
            return (Criteria) this;
        }

        public Criteria andZczjEqualTo(String value) {
            addCriterion("zczj =", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjNotEqualTo(String value) {
            addCriterion("zczj <>", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjGreaterThan(String value) {
            addCriterion("zczj >", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjGreaterThanOrEqualTo(String value) {
            addCriterion("zczj >=", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjLessThan(String value) {
            addCriterion("zczj <", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjLessThanOrEqualTo(String value) {
            addCriterion("zczj <=", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjLike(String value) {
            addCriterion("zczj like", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjNotLike(String value) {
            addCriterion("zczj not like", value, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjIn(List<String> values) {
            addCriterion("zczj in", values, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjNotIn(List<String> values) {
            addCriterion("zczj not in", values, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjBetween(String value1, String value2) {
            addCriterion("zczj between", value1, value2, "zczj");
            return (Criteria) this;
        }

        public Criteria andZczjNotBetween(String value1, String value2) {
            addCriterion("zczj not between", value1, value2, "zczj");
            return (Criteria) this;
        }

        public Criteria andXseIsNull() {
            addCriterion("xse is null");
            return (Criteria) this;
        }

        public Criteria andXseIsNotNull() {
            addCriterion("xse is not null");
            return (Criteria) this;
        }

        public Criteria andXseEqualTo(String value) {
            addCriterion("xse =", value, "xse");
            return (Criteria) this;
        }

        public Criteria andXseNotEqualTo(String value) {
            addCriterion("xse <>", value, "xse");
            return (Criteria) this;
        }

        public Criteria andXseGreaterThan(String value) {
            addCriterion("xse >", value, "xse");
            return (Criteria) this;
        }

        public Criteria andXseGreaterThanOrEqualTo(String value) {
            addCriterion("xse >=", value, "xse");
            return (Criteria) this;
        }

        public Criteria andXseLessThan(String value) {
            addCriterion("xse <", value, "xse");
            return (Criteria) this;
        }

        public Criteria andXseLessThanOrEqualTo(String value) {
            addCriterion("xse <=", value, "xse");
            return (Criteria) this;
        }

        public Criteria andXseLike(String value) {
            addCriterion("xse like", value, "xse");
            return (Criteria) this;
        }

        public Criteria andXseNotLike(String value) {
            addCriterion("xse not like", value, "xse");
            return (Criteria) this;
        }

        public Criteria andXseIn(List<String> values) {
            addCriterion("xse in", values, "xse");
            return (Criteria) this;
        }

        public Criteria andXseNotIn(List<String> values) {
            addCriterion("xse not in", values, "xse");
            return (Criteria) this;
        }

        public Criteria andXseBetween(String value1, String value2) {
            addCriterion("xse between", value1, value2, "xse");
            return (Criteria) this;
        }

        public Criteria andXseNotBetween(String value1, String value2) {
            addCriterion("xse not between", value1, value2, "xse");
            return (Criteria) this;
        }

        public Criteria andDzyxIsNull() {
            addCriterion("dzyx is null");
            return (Criteria) this;
        }

        public Criteria andDzyxIsNotNull() {
            addCriterion("dzyx is not null");
            return (Criteria) this;
        }

        public Criteria andDzyxEqualTo(String value) {
            addCriterion("dzyx =", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotEqualTo(String value) {
            addCriterion("dzyx <>", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxGreaterThan(String value) {
            addCriterion("dzyx >", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxGreaterThanOrEqualTo(String value) {
            addCriterion("dzyx >=", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxLessThan(String value) {
            addCriterion("dzyx <", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxLessThanOrEqualTo(String value) {
            addCriterion("dzyx <=", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxLike(String value) {
            addCriterion("dzyx like", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotLike(String value) {
            addCriterion("dzyx not like", value, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxIn(List<String> values) {
            addCriterion("dzyx in", values, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotIn(List<String> values) {
            addCriterion("dzyx not in", values, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxBetween(String value1, String value2) {
            addCriterion("dzyx between", value1, value2, "dzyx");
            return (Criteria) this;
        }

        public Criteria andDzyxNotBetween(String value1, String value2) {
            addCriterion("dzyx not between", value1, value2, "dzyx");
            return (Criteria) this;
        }

        public Criteria andWzIsNull() {
            addCriterion("wz is null");
            return (Criteria) this;
        }

        public Criteria andWzIsNotNull() {
            addCriterion("wz is not null");
            return (Criteria) this;
        }

        public Criteria andWzEqualTo(String value) {
            addCriterion("wz =", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotEqualTo(String value) {
            addCriterion("wz <>", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzGreaterThan(String value) {
            addCriterion("wz >", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzGreaterThanOrEqualTo(String value) {
            addCriterion("wz >=", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzLessThan(String value) {
            addCriterion("wz <", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzLessThanOrEqualTo(String value) {
            addCriterion("wz <=", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzLike(String value) {
            addCriterion("wz like", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotLike(String value) {
            addCriterion("wz not like", value, "wz");
            return (Criteria) this;
        }

        public Criteria andWzIn(List<String> values) {
            addCriterion("wz in", values, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotIn(List<String> values) {
            addCriterion("wz not in", values, "wz");
            return (Criteria) this;
        }

        public Criteria andWzBetween(String value1, String value2) {
            addCriterion("wz between", value1, value2, "wz");
            return (Criteria) this;
        }

        public Criteria andWzNotBetween(String value1, String value2) {
            addCriterion("wz not between", value1, value2, "wz");
            return (Criteria) this;
        }

        public Criteria andDmzhIsNull() {
            addCriterion("dmzh is null");
            return (Criteria) this;
        }

        public Criteria andDmzhIsNotNull() {
            addCriterion("dmzh is not null");
            return (Criteria) this;
        }

        public Criteria andDmzhEqualTo(String value) {
            addCriterion("dmzh =", value, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhNotEqualTo(String value) {
            addCriterion("dmzh <>", value, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhGreaterThan(String value) {
            addCriterion("dmzh >", value, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhGreaterThanOrEqualTo(String value) {
            addCriterion("dmzh >=", value, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhLessThan(String value) {
            addCriterion("dmzh <", value, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhLessThanOrEqualTo(String value) {
            addCriterion("dmzh <=", value, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhLike(String value) {
            addCriterion("dmzh like", value, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhNotLike(String value) {
            addCriterion("dmzh not like", value, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhIn(List<String> values) {
            addCriterion("dmzh in", values, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhNotIn(List<String> values) {
            addCriterion("dmzh not in", values, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhBetween(String value1, String value2) {
            addCriterion("dmzh between", value1, value2, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhNotBetween(String value1, String value2) {
            addCriterion("dmzh not between", value1, value2, "dmzh");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqIsNull() {
            addCriterion("dmzhyxq is null");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqIsNotNull() {
            addCriterion("dmzhyxq is not null");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqEqualTo(String value) {
            addCriterion("dmzhyxq =", value, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqNotEqualTo(String value) {
            addCriterion("dmzhyxq <>", value, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqGreaterThan(String value) {
            addCriterion("dmzhyxq >", value, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqGreaterThanOrEqualTo(String value) {
            addCriterion("dmzhyxq >=", value, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqLessThan(String value) {
            addCriterion("dmzhyxq <", value, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqLessThanOrEqualTo(String value) {
            addCriterion("dmzhyxq <=", value, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqLike(String value) {
            addCriterion("dmzhyxq like", value, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqNotLike(String value) {
            addCriterion("dmzhyxq not like", value, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqIn(List<String> values) {
            addCriterion("dmzhyxq in", values, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqNotIn(List<String> values) {
            addCriterion("dmzhyxq not in", values, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqBetween(String value1, String value2) {
            addCriterion("dmzhyxq between", value1, value2, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andDmzhyxqNotBetween(String value1, String value2) {
            addCriterion("dmzhyxq not between", value1, value2, "dmzhyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzIsNull() {
            addCriterion("yyzz is null");
            return (Criteria) this;
        }

        public Criteria andYyzzIsNotNull() {
            addCriterion("yyzz is not null");
            return (Criteria) this;
        }

        public Criteria andYyzzEqualTo(String value) {
            addCriterion("yyzz =", value, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzNotEqualTo(String value) {
            addCriterion("yyzz <>", value, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzGreaterThan(String value) {
            addCriterion("yyzz >", value, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzGreaterThanOrEqualTo(String value) {
            addCriterion("yyzz >=", value, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzLessThan(String value) {
            addCriterion("yyzz <", value, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzLessThanOrEqualTo(String value) {
            addCriterion("yyzz <=", value, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzLike(String value) {
            addCriterion("yyzz like", value, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzNotLike(String value) {
            addCriterion("yyzz not like", value, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzIn(List<String> values) {
            addCriterion("yyzz in", values, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzNotIn(List<String> values) {
            addCriterion("yyzz not in", values, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzBetween(String value1, String value2) {
            addCriterion("yyzz between", value1, value2, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzNotBetween(String value1, String value2) {
            addCriterion("yyzz not between", value1, value2, "yyzz");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqIsNull() {
            addCriterion("yyzzyxq is null");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqIsNotNull() {
            addCriterion("yyzzyxq is not null");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqEqualTo(String value) {
            addCriterion("yyzzyxq =", value, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqNotEqualTo(String value) {
            addCriterion("yyzzyxq <>", value, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqGreaterThan(String value) {
            addCriterion("yyzzyxq >", value, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqGreaterThanOrEqualTo(String value) {
            addCriterion("yyzzyxq >=", value, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqLessThan(String value) {
            addCriterion("yyzzyxq <", value, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqLessThanOrEqualTo(String value) {
            addCriterion("yyzzyxq <=", value, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqLike(String value) {
            addCriterion("yyzzyxq like", value, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqNotLike(String value) {
            addCriterion("yyzzyxq not like", value, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqIn(List<String> values) {
            addCriterion("yyzzyxq in", values, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqNotIn(List<String> values) {
            addCriterion("yyzzyxq not in", values, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqBetween(String value1, String value2) {
            addCriterion("yyzzyxq between", value1, value2, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andYyzzyxqNotBetween(String value1, String value2) {
            addCriterion("yyzzyxq not between", value1, value2, "yyzzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzIsNull() {
            addCriterion("xyz is null");
            return (Criteria) this;
        }

        public Criteria andXyzIsNotNull() {
            addCriterion("xyz is not null");
            return (Criteria) this;
        }

        public Criteria andXyzEqualTo(String value) {
            addCriterion("xyz =", value, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzNotEqualTo(String value) {
            addCriterion("xyz <>", value, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzGreaterThan(String value) {
            addCriterion("xyz >", value, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzGreaterThanOrEqualTo(String value) {
            addCriterion("xyz >=", value, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzLessThan(String value) {
            addCriterion("xyz <", value, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzLessThanOrEqualTo(String value) {
            addCriterion("xyz <=", value, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzLike(String value) {
            addCriterion("xyz like", value, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzNotLike(String value) {
            addCriterion("xyz not like", value, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzIn(List<String> values) {
            addCriterion("xyz in", values, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzNotIn(List<String> values) {
            addCriterion("xyz not in", values, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzBetween(String value1, String value2) {
            addCriterion("xyz between", value1, value2, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzNotBetween(String value1, String value2) {
            addCriterion("xyz not between", value1, value2, "xyz");
            return (Criteria) this;
        }

        public Criteria andXyzbmIsNull() {
            addCriterion("xyzbm is null");
            return (Criteria) this;
        }

        public Criteria andXyzbmIsNotNull() {
            addCriterion("xyzbm is not null");
            return (Criteria) this;
        }

        public Criteria andXyzbmEqualTo(String value) {
            addCriterion("xyzbm =", value, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmNotEqualTo(String value) {
            addCriterion("xyzbm <>", value, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmGreaterThan(String value) {
            addCriterion("xyzbm >", value, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmGreaterThanOrEqualTo(String value) {
            addCriterion("xyzbm >=", value, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmLessThan(String value) {
            addCriterion("xyzbm <", value, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmLessThanOrEqualTo(String value) {
            addCriterion("xyzbm <=", value, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmLike(String value) {
            addCriterion("xyzbm like", value, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmNotLike(String value) {
            addCriterion("xyzbm not like", value, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmIn(List<String> values) {
            addCriterion("xyzbm in", values, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmNotIn(List<String> values) {
            addCriterion("xyzbm not in", values, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmBetween(String value1, String value2) {
            addCriterion("xyzbm between", value1, value2, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzbmNotBetween(String value1, String value2) {
            addCriterion("xyzbm not between", value1, value2, "xyzbm");
            return (Criteria) this;
        }

        public Criteria andXyzyxqIsNull() {
            addCriterion("xyzyxq is null");
            return (Criteria) this;
        }

        public Criteria andXyzyxqIsNotNull() {
            addCriterion("xyzyxq is not null");
            return (Criteria) this;
        }

        public Criteria andXyzyxqEqualTo(String value) {
            addCriterion("xyzyxq =", value, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqNotEqualTo(String value) {
            addCriterion("xyzyxq <>", value, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqGreaterThan(String value) {
            addCriterion("xyzyxq >", value, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqGreaterThanOrEqualTo(String value) {
            addCriterion("xyzyxq >=", value, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqLessThan(String value) {
            addCriterion("xyzyxq <", value, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqLessThanOrEqualTo(String value) {
            addCriterion("xyzyxq <=", value, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqLike(String value) {
            addCriterion("xyzyxq like", value, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqNotLike(String value) {
            addCriterion("xyzyxq not like", value, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqIn(List<String> values) {
            addCriterion("xyzyxq in", values, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqNotIn(List<String> values) {
            addCriterion("xyzyxq not in", values, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqBetween(String value1, String value2) {
            addCriterion("xyzyxq between", value1, value2, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andXyzyxqNotBetween(String value1, String value2) {
            addCriterion("xyzyxq not between", value1, value2, "xyzyxq");
            return (Criteria) this;
        }

        public Criteria andGdzcIsNull() {
            addCriterion("gdzc is null");
            return (Criteria) this;
        }

        public Criteria andGdzcIsNotNull() {
            addCriterion("gdzc is not null");
            return (Criteria) this;
        }

        public Criteria andGdzcEqualTo(String value) {
            addCriterion("gdzc =", value, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcNotEqualTo(String value) {
            addCriterion("gdzc <>", value, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcGreaterThan(String value) {
            addCriterion("gdzc >", value, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcGreaterThanOrEqualTo(String value) {
            addCriterion("gdzc >=", value, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcLessThan(String value) {
            addCriterion("gdzc <", value, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcLessThanOrEqualTo(String value) {
            addCriterion("gdzc <=", value, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcLike(String value) {
            addCriterion("gdzc like", value, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcNotLike(String value) {
            addCriterion("gdzc not like", value, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcIn(List<String> values) {
            addCriterion("gdzc in", values, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcNotIn(List<String> values) {
            addCriterion("gdzc not in", values, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcBetween(String value1, String value2) {
            addCriterion("gdzc between", value1, value2, "gdzc");
            return (Criteria) this;
        }

        public Criteria andGdzcNotBetween(String value1, String value2) {
            addCriterion("gdzc not between", value1, value2, "gdzc");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("bz is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("bz is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("bz =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("bz <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("bz >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("bz >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("bz <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("bz <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("bz like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("bz not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("bz in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("bz not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("bz between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("bz not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andVchar1IsNull() {
            addCriterion("vchar1 is null");
            return (Criteria) this;
        }

        public Criteria andVchar1IsNotNull() {
            addCriterion("vchar1 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar1EqualTo(String value) {
            addCriterion("vchar1 =", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotEqualTo(String value) {
            addCriterion("vchar1 <>", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1GreaterThan(String value) {
            addCriterion("vchar1 >", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1GreaterThanOrEqualTo(String value) {
            addCriterion("vchar1 >=", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1LessThan(String value) {
            addCriterion("vchar1 <", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1LessThanOrEqualTo(String value) {
            addCriterion("vchar1 <=", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1Like(String value) {
            addCriterion("vchar1 like", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotLike(String value) {
            addCriterion("vchar1 not like", value, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1In(List<String> values) {
            addCriterion("vchar1 in", values, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotIn(List<String> values) {
            addCriterion("vchar1 not in", values, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1Between(String value1, String value2) {
            addCriterion("vchar1 between", value1, value2, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar1NotBetween(String value1, String value2) {
            addCriterion("vchar1 not between", value1, value2, "vchar1");
            return (Criteria) this;
        }

        public Criteria andVchar2IsNull() {
            addCriterion("vchar2 is null");
            return (Criteria) this;
        }

        public Criteria andVchar2IsNotNull() {
            addCriterion("vchar2 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar2EqualTo(String value) {
            addCriterion("vchar2 =", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotEqualTo(String value) {
            addCriterion("vchar2 <>", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2GreaterThan(String value) {
            addCriterion("vchar2 >", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2GreaterThanOrEqualTo(String value) {
            addCriterion("vchar2 >=", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2LessThan(String value) {
            addCriterion("vchar2 <", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2LessThanOrEqualTo(String value) {
            addCriterion("vchar2 <=", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2Like(String value) {
            addCriterion("vchar2 like", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotLike(String value) {
            addCriterion("vchar2 not like", value, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2In(List<String> values) {
            addCriterion("vchar2 in", values, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotIn(List<String> values) {
            addCriterion("vchar2 not in", values, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2Between(String value1, String value2) {
            addCriterion("vchar2 between", value1, value2, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar2NotBetween(String value1, String value2) {
            addCriterion("vchar2 not between", value1, value2, "vchar2");
            return (Criteria) this;
        }

        public Criteria andVchar3IsNull() {
            addCriterion("vchar3 is null");
            return (Criteria) this;
        }

        public Criteria andVchar3IsNotNull() {
            addCriterion("vchar3 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar3EqualTo(String value) {
            addCriterion("vchar3 =", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotEqualTo(String value) {
            addCriterion("vchar3 <>", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3GreaterThan(String value) {
            addCriterion("vchar3 >", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3GreaterThanOrEqualTo(String value) {
            addCriterion("vchar3 >=", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3LessThan(String value) {
            addCriterion("vchar3 <", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3LessThanOrEqualTo(String value) {
            addCriterion("vchar3 <=", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3Like(String value) {
            addCriterion("vchar3 like", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotLike(String value) {
            addCriterion("vchar3 not like", value, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3In(List<String> values) {
            addCriterion("vchar3 in", values, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotIn(List<String> values) {
            addCriterion("vchar3 not in", values, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3Between(String value1, String value2) {
            addCriterion("vchar3 between", value1, value2, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar3NotBetween(String value1, String value2) {
            addCriterion("vchar3 not between", value1, value2, "vchar3");
            return (Criteria) this;
        }

        public Criteria andVchar4IsNull() {
            addCriterion("vchar4 is null");
            return (Criteria) this;
        }

        public Criteria andVchar4IsNotNull() {
            addCriterion("vchar4 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar4EqualTo(String value) {
            addCriterion("vchar4 =", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotEqualTo(String value) {
            addCriterion("vchar4 <>", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4GreaterThan(String value) {
            addCriterion("vchar4 >", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4GreaterThanOrEqualTo(String value) {
            addCriterion("vchar4 >=", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4LessThan(String value) {
            addCriterion("vchar4 <", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4LessThanOrEqualTo(String value) {
            addCriterion("vchar4 <=", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4Like(String value) {
            addCriterion("vchar4 like", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotLike(String value) {
            addCriterion("vchar4 not like", value, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4In(List<String> values) {
            addCriterion("vchar4 in", values, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotIn(List<String> values) {
            addCriterion("vchar4 not in", values, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4Between(String value1, String value2) {
            addCriterion("vchar4 between", value1, value2, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar4NotBetween(String value1, String value2) {
            addCriterion("vchar4 not between", value1, value2, "vchar4");
            return (Criteria) this;
        }

        public Criteria andVchar5IsNull() {
            addCriterion("vchar5 is null");
            return (Criteria) this;
        }

        public Criteria andVchar5IsNotNull() {
            addCriterion("vchar5 is not null");
            return (Criteria) this;
        }

        public Criteria andVchar5EqualTo(String value) {
            addCriterion("vchar5 =", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotEqualTo(String value) {
            addCriterion("vchar5 <>", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5GreaterThan(String value) {
            addCriterion("vchar5 >", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5GreaterThanOrEqualTo(String value) {
            addCriterion("vchar5 >=", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5LessThan(String value) {
            addCriterion("vchar5 <", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5LessThanOrEqualTo(String value) {
            addCriterion("vchar5 <=", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5Like(String value) {
            addCriterion("vchar5 like", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotLike(String value) {
            addCriterion("vchar5 not like", value, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5In(List<String> values) {
            addCriterion("vchar5 in", values, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotIn(List<String> values) {
            addCriterion("vchar5 not in", values, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5Between(String value1, String value2) {
            addCriterion("vchar5 between", value1, value2, "vchar5");
            return (Criteria) this;
        }

        public Criteria andVchar5NotBetween(String value1, String value2) {
            addCriterion("vchar5 not between", value1, value2, "vchar5");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}