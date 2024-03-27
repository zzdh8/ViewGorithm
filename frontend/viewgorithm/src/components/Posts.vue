<template>
    <div class="board">
        <h1>게시판</h1>
        <ul>
            <li v-for="post in posts" :key="post.id">
                <span>{{ post.id }}</span>
                <span>{{ post.userId }}</span>
                <span>{{ post.title }}</span>
                <span>{{ post.content }}</span>
            </li>
        </ul>
    </div>
</template>

<script>
export default {
    data() {
        return {
            posts: [
                { id: 1, userId: 'user1', title: '게시글 1', content: '내용 1' },
                { id: 2, userId: 'user2', title: '게시글 2', content: '내용 2' },
                { id: 3, userId: 'user3', title: '게시글 3', content: '내용 3' },
            ],
        };
    },
};
</script>

<style scoped>
.board {
    background-color: white;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.board h1 {
    font-size: 24px;
    margin-bottom: 20px;
}

.board ul {
    list-style-type: none;
    padding: 0;
}

.board li {
    margin-bottom: 10px;
    padding: 10px;
    background-color: #f5f5f5;
    border-radius: 5px;
}

.board span {
    margin-right: 10px;
}
</style>