package com.framgia.fbook.screen.SearchBook.internalbook

import com.framgia.fbook.data.model.Book
import com.framgia.fbook.data.source.remote.api.error.BaseException
import com.framgia.fbook.screen.BasePresenter
import com.framgia.fbook.screen.BaseViewModel

/**
 * This specifies the contract between the view and the presenter.
 */
interface InternalBookContract {
  /**
   * View.
   */
  interface ViewModel : BaseViewModel {
    fun onError(e: BaseException)

    fun onSearchBookSuccess(listBook: List<Book>?)

    fun onShowProgressDialog()

    fun onDismissProgressDialog()
  }

  /**
   * Presenter.
   */
  interface Presenter : BasePresenter<ViewModel> {
    fun searchBook(keyword: String?, field: String?)
  }
}
