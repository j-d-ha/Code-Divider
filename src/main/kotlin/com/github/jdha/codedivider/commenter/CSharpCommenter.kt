package com.github.jdha.codedivider.commenter

import com.intellij.lang.Commenter

class CSharpCommenter : Commenter {
    companion object {
        val INSTANCE = CSharpCommenter()
    }

    override fun getLineCommentPrefix(): String? {
        return "//"
    }

    override fun getBlockCommentPrefix(): String? {
        return "/*"
    }

    override fun getBlockCommentSuffix(): String? {
        return "*/"
    }

    override fun getCommentedBlockCommentPrefix(): String? {
        return null
    }

    override fun getCommentedBlockCommentSuffix(): String? {
        return null
    }
}
