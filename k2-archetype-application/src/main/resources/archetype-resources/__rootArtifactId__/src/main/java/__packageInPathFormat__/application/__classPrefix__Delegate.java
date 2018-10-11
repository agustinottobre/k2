#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

/* vim: set et ts=2 sw=2 cindent fo=qroca: */

package ${package}.application;

import org.springframework.http.ResponseEntity;

import ${package}.swagger.${classPrefix}ApiDelegate;
import ${package}.swagger.SampleDto;

/** The ${classPrefix} delegate implementation for swagger.
 */
public class ${classPrefix}Delegate implements ${classPrefix}ApiDelegate {
  /** The sample id. */
  private static final long SAMPLE_ID = 10L;

  /** The getSample implementation.
   *
   * @return a sample instance.
   */
  @Override
  public ResponseEntity<SampleDto> getSample() {
    SampleDto result = new SampleDto();
    result.id(SAMPLE_ID);
    result.name("Name for id 10");
    return ResponseEntity.ok(result);
  }
}

