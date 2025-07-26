package com.github.jdha.codedivider.commenter

import com.intellij.lang.Commenter

class FSharpCommenter : Commenter {
    companion object {
        val INSTANCE = FSharpCommenter()
    }

    override fun getLineCommentPrefix(): String? {
        return "//"
    }

    override fun getBlockCommentPrefix(): String? {
        return "(*"
    }

    override fun getBlockCommentSuffix(): String? {
        return "*)"
    }

    override fun getCommentedBlockCommentPrefix(): String? {
        // F# supports nested comments, so we can return the block comment prefix
        return "(*"
    }

    override fun getCommentedBlockCommentSuffix(): String? {
        // F# supports nested comments, so we can return the block comment suffix
        return "*)"
    }
}
