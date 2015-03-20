// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.ericsson.otp.erlang.OtpErlangObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ElixirAtNumericOperation extends PrefixOperation {

  @NotNull
  ElixirAtPrefixOperator getAtPrefixOperator();

  @Nullable
  ElixirCharToken getCharToken();

  @Nullable
  ElixirNumber getNumber();

  @NotNull
  OtpErlangObject quote();

}
