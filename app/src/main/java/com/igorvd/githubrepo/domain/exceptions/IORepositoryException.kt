package com.igorvd.githubrepo.domain.exceptions

/**
 * @author Igor Vilela
 * @since 14/10/17
 */
class IORepositoryException : RepositoryException {

    constructor(t: Throwable) : super(t)
    constructor(message: String) : super(message)

}